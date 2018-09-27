package com.xgame.config.gain;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class GainPir extends BaseFilePri{
	
	/**﻿增益ID*/
	int id;
	/**名称*/
	int name;
	/**描述*/
	int describe;
	/**图标*/
	Object icon;
	/**道具库*/
	Object propsLibrary;
	
	
	
	/**﻿增益ID*/
	public int getId(){
		return id;
	}
	/**名称*/
	public int getName(){
		return name;
	}
	/**描述*/
	public int getDescribe(){
		return describe;
	}
	/**图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**道具库*/
	@SuppressWarnings("unchecked")
	public <T> T getPropsLibrary(){
		return (T)propsLibrary;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}