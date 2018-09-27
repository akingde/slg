package com.xgame.config.CHlanguage_ZhCN;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class CHlanguage_ZhCNPir extends BaseFilePri{
	
	/**﻿多语言ID*/
	int id;
	/**ZhCN*/
	Object ZhCN;
	
	
	
	/**﻿多语言ID*/
	public int getId(){
		return id;
	}
	/**ZhCN*/
	@SuppressWarnings("unchecked")
	public <T> T getZhCN(){
		return (T)ZhCN;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}