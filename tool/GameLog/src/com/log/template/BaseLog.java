package com.log.template;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.log.GameLogSystem;
import com.log.annotation.Column;
import com.log.annotation.Template;
import com.log.util.ClassUtil;
import com.log.util.MetaData;
import com.log.util.TableType;

/**
 * 日志基础类
 * 
 * @author ye.yuan
 *
 */
public abstract class BaseLog {
	
	private static Logger logger = Logger.getLogger(BaseLog.class);

	private static ConcurrentHashMap<Class<? extends BaseLog>, List<MetaData>> metadataMap = new ConcurrentHashMap<>();

	private static SimpleDateFormat YYYY_MM_DD_HH_MM_SS = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	private static SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat(
			"yyyyMMdd");

	private static SimpleDateFormat YYYY_MM = new SimpleDateFormat("yyyyMM");
	
	private static SimpleDateFormat YYYY = new SimpleDateFormat("yyyy");

	@Column(fieldType = "bigint", remark = "插入时间")
	public long time = System.currentTimeMillis();
	
	
	private Set<String> necessaryFields = new HashSet<>();

	private static Set<Class<BaseLog>> newVersionClass = null;
	
	@Column(fieldType = "int(11)", remark = "行为id")
	protected int actionId;
	
	@Column(fieldType = "int(11)", remark = "来源")
	protected int sourceId;
	
	protected long subscribeId;
	
	public BaseLog() {
		
	}
	
	public BaseLog(int sourceId,int acitonId,long subscribeId){
		this.sourceId=sourceId;
		this.actionId=acitonId;
		this.subscribeId = subscribeId;
	}
	
	public void load(GameLogSystem logSystem){
		if (!metadataMap.containsKey(getClass())) {
			Template template = (Template) getClass().getSuperclass()
					.getAnnotation(Template.class);
			if (template != null) {
				String[] nsFields = template.necessaryFields().split(",");
				for (String string : nsFields) {
					this.necessaryFields.add(string);
				}
				List<MetaData> metadata = new ArrayList<>();
				if (newVersionClass == null) {
					newVersionClass = getNewVersionClass(logSystem);
				}
				List<Field> fields = null;
				if (newVersionClass.contains(getClass().getSuperclass()))
					fields = ClassUtil.getAllFields(getClass());
				else {
					fields = Arrays.asList(getClass().getSuperclass().getFields());
				}
				for (Field field : fields) {
					try {
						
						field:{
							Column column = field.getAnnotation(Column.class);
							if (column != null) {
								metadata.add(new MetaData(field.getName(),column.fieldType(), column.remark()));
							}
							break field;
						}
//						method:{
//							PropertyDescriptor pd = new PropertyDescriptor(
//									field.getName(), getClass());
//							Method method = pd.getReadMethod();
//							if (method != null) {
//								Column column = (Column) method
//										.getAnnotation(Column.class);
//								if (column != null) {
//									metadata.add(new MetaData(field.getName(),column.fieldType(), column.remark()));
//								} else {
//									pd = new PropertyDescriptor(field.getName(),getClass().getSuperclass());
//									method = pd.getReadMethod();
//									if (method != null) {
//										column = (Column) method.getAnnotation(Column.class);
//										if (column != null)
//											metadata.add(new MetaData(field.getName(), column.fieldType(),column.remark()));
//									}
//								}
//							}
//						}
					} catch (Exception e) {
						logger.error(getClass().getName() + ":"
								+ e.getMessage());
					}
				}
				metadataMap.putIfAbsent(getClass(), metadata);
			} else {
				try {
					throw new Exception("日持数据读取出错");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Set<Class<BaseLog>> getNewVersionClass(GameLogSystem logSystem) {
		Set<Class<BaseLog>> newVersionClass = ClassUtil.getSubClasses(logSystem.getSuperClassUrl(), BaseLog.class);
		return newVersionClass;
	}

	/**
	 * 构建插入sql
	 * 
	 * @return sql表达式
	 * @throws Exception
	 */
	public String buildInsertSql() throws Exception {
		String tableName = buildTableName(this.time);
		String fields = "(";
		String values = "(";

		HashMap<String, Object> param = getParam();
		for (String key : param.keySet()) {
			fields = fields + key + ",";
			values = values + dealValue(param.get(key)) + ",";
		}
		if (fields.length() > 1) {
			fields = fields.substring(0, fields.length() - 1);
		}
		if (values.length() > 1) {
			values = values.substring(0, values.length() - 1);
		}
		fields = fields + ")";
		values = values + ")";

		StringBuffer buffer = new StringBuffer("insert into `" + tableName
				+ "` ").append(fields).append("values").append(values);
		String returnString = buffer.toString();
		return returnString;
	}

	public String dealValue(Object object) {
		if (object == null) {
			return "null";
		}
		if ((object instanceof Date)) {
			return "'" + YYYY_MM_DD_HH_MM_SS.format(object) + "'";
		}
		if (((object instanceof Integer)) || ((object instanceof String))
				|| ((object instanceof Long)) || ((object instanceof Short))
				|| ((object instanceof Byte))) {
			return "'" + object.toString() + "'";
		}
		String result = null;
		try {
			result = JSON.toJSONString(object, new SerializerFeature[] {
					SerializerFeature.WriteClassName,
					SerializerFeature.DisableCircularReferenceDetect });
		} catch (Exception e) {
			logger.error(getClass().getName() + "json:" + object);
		}
		return "'" + result + "'";
	}

	/**
	 * 把变量值插入map   打了注解的才会插入
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> getParam() throws Exception {
		HashMap<String, Object> param = new HashMap<>();
		List<Field> fields = null;
		if (newVersionClass.contains(getClass().getSuperclass()))
			fields = ClassUtil.getAllFields(getClass());
		else {
			fields = Arrays.asList(getClass().getSuperclass().getFields());
		}
		for (Field field : fields) {
			field.setAccessible(true);
			Column column = field.getAnnotation(Column.class);
			if (column != null) {
				Object object = field.get(this);
				param.put(field.getName(), object);
				if ((this.necessaryFields.contains(field.getName()))
						&& ((object == null) || (object.equals("")))) {
					throw new Exception(getClass().getName() + "字段  "
							+ field.getName() + " 不能为空");
				}
			}
//			PropertyDescriptor pd = new PropertyDescriptor(field.getName(),
//					getClass());
//			Method method = pd.getReadMethod();
//			if (method != null) {
//				Object value = method.invoke(this, new Object[0]);
//				param.put(field.getName(), value);
//				if ((this.necessaryFields.contains(field.getName()))
//						&& ((value == null) || (value.equals("")))) {
//					throw new Exception(getClass().getName() + "字段  "
//							+ field.getName() + " 不能为空");
//				}
//			}
			field.setAccessible(false);
		}
		return param;
	}

	public String buildCreateTableSql(long time) {
		StringBuffer DDL = new StringBuffer();
		DDL.append("CREATE TABLE IF NOT EXISTS `").append(buildTableName(time))
				.append("` (\n`id` int(11) NOT NULL AUTO_INCREMENT,\n");
		for (MetaData metaData : (List<MetaData>) metadataMap.get(getClass())) {
			DDL.append(metaData).append(",\n");
		}
		DDL.append("PRIMARY KEY (`id`)) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8");
		return DDL.toString();
	}

	public String buildTableName(long time) {
		String tablename = getTableName();
		switch (getTableType()) {
		case DAY:
			tablename = tablename + YYYY_MM_DD.format(new Date(time));
			break;
		case MONTH:
			tablename = tablename + YYYY_MM.format(new Date(time));
			break;
		case YEAR:
			tablename = tablename + YYYY.format(new Date(time));
			break;
		case SINGLE:
		}
		return tablename;
	}
	
	public static ConcurrentHashMap<Class<? extends BaseLog>, List<MetaData>> getMetadataMap() {
		return metadataMap;
	}

	public String getTableName() {
		return getClass().getSimpleName().toLowerCase();
	}

	public abstract TableType getTableType();

	public abstract void logToFile();

	public List<MetaData> getMetadata() {
		return (List<MetaData>) metadataMap.get(getClass());
	}

	
	public Long getTime() {
		return Long.valueOf(this.time);
	}

	public void setTime(Long time) {
		this.time = time.longValue();
	}

	public void setActionId(int actionId) {
		this.actionId = actionId;
	}

	public long getSubscribeId() {
		return subscribeId;
	}

	public void setSubscribeId(long subscribeId) {
		this.subscribeId = subscribeId;
	}

	
	public int getSourceId() {
		return sourceId;
	}
	
	public int getActionId() {
		return actionId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
}