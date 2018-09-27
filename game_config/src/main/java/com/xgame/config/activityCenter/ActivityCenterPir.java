package com.xgame.config.activityCenter;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ActivityCenterPir extends BaseFilePri{
	
	/**﻿id*/
	int id;
	/**活动名字*/
	int name;
	/**活动说明*/
	int des;
	/**活动开启类型（1:每周固定一天开启)*/
	int openType;
	/**活动开启时间*/
	Object time;
	/**活动图片*/
	Object picture;
	/**排序*/
	int index;
	
	
	
	/**﻿id*/
	public int getId(){
		return id;
	}
	/**活动名字*/
	public int getName(){
		return name;
	}
	/**活动说明*/
	public int getDes(){
		return des;
	}
	/**活动开启类型（1:每周固定一天开启)*/
	public int getOpenType(){
		return openType;
	}
	/**活动开启时间*/
	@SuppressWarnings("unchecked")
	public <T> T getTime(){
		return (T)time;
	}
	/**活动图片*/
	@SuppressWarnings("unchecked")
	public <T> T getPicture(){
		return (T)picture;
	}
	/**排序*/
	public int getIndex(){
		return index;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}