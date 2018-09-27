package com.xgame.config.governmentOfficial;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class GovernmentOfficialPir extends BaseFilePri{
	
	/**﻿头衔ID*/
	int id;
	/**头衔名称*/
	int name;
	/**头衔图标*/
	Object icon;
	/**头衔级别*/
	int lv;
	/**是否可被分配税收*/
	int allot;
	/**属性*/
	Object attr;
	
	
	
	/**﻿头衔ID*/
	public int getId(){
		return id;
	}
	/**头衔名称*/
	public int getName(){
		return name;
	}
	/**头衔图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**头衔级别*/
	public int getLv(){
		return lv;
	}
	/**是否可被分配税收*/
	public int getAllot(){
		return allot;
	}
	/**属性*/
	@SuppressWarnings("unchecked")
	public <T> T getAttr(){
		return (T)attr;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}