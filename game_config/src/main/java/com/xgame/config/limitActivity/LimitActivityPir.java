package com.xgame.config.limitActivity;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class LimitActivityPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**标签名*/
	int name;
	/**描述*/
	int desc;
	/**活动类型（对应表格名）*/
	Object table;
	/**活动参数（对应表的activityType类型，0表示不存在活动类型）*/
	int activityType;
	/**时间类型（1开服开启，2固定时间开启）*/
	int timeType;
	/**开启时间（1开服第N天，2年月日）*/
	int v1;
	/**结束时间（1开服第N天，2年月日，-1永久，0不开）*/
	int v2;
	/**关闭时间（结束时间之后第N天）*/
	int closeTime;
	/**活动标签排序*/
	int order;
	/**活动状态（0关1开）*/
	int status;
	/**开服时间范围（天）*/
	Object serverTime;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**标签名*/
	public int getName(){
		return name;
	}
	/**描述*/
	public int getDesc(){
		return desc;
	}
	/**活动类型（对应表格名）*/
	@SuppressWarnings("unchecked")
	public <T> T getTable(){
		return (T)table;
	}
	/**活动参数（对应表的activityType类型，0表示不存在活动类型）*/
	public int getActivityType(){
		return activityType;
	}
	/**时间类型（1开服开启，2固定时间开启）*/
	public int getTimeType(){
		return timeType;
	}
	/**开启时间（1开服第N天，2年月日）*/
	public int getV1(){
		return v1;
	}
	/**结束时间（1开服第N天，2年月日，-1永久，0不开）*/
	public int getV2(){
		return v2;
	}
	/**关闭时间（结束时间之后第N天）*/
	public int getCloseTime(){
		return closeTime;
	}
	/**活动标签排序*/
	public int getOrder(){
		return order;
	}
	/**活动状态（0关1开）*/
	public int getStatus(){
		return status;
	}
	/**开服时间范围（天）*/
	@SuppressWarnings("unchecked")
	public <T> T getServerTime(){
		return (T)serverTime;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}