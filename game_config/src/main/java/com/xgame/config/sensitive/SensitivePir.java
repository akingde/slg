package com.xgame.config.sensitive;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class SensitivePir extends BaseFilePri{
	
	/**﻿描述*/
	Object desc;
	
	
	
	/**﻿描述*/
	@SuppressWarnings("unchecked")
	public <T> T getDesc(){
		return (T)desc;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}