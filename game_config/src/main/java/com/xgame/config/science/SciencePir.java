package com.xgame.config.science;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class SciencePir extends BaseFilePri{
	
	/**﻿ID*/
	int ID;
	/**名称（多语言配置表ID）*/
	int name;
	/**功能描述（多语言配置表ID）*/
	int features;
	/**类型(分页类型1战争，2战略，3采集，子类型，1履式，2轮式，3直升机)*/
	Object type;
	/**坐标（列，行）*/
	Object column;
	/**最高等级*/
	int max_lv;
	/**前置建筑（多个建筑用逗号分隔）*/
	Object building_id;
	/**解锁下一个科技需要的等级*/
	int unlock_next_lv;
	/**前置科技*/
	Object require_id;
	/**增加类型（不再使用）*/
	Object type2;
	/**V1（属性ID;）*/
	Object v1;
	/**V2（等级增加数值）*/
	Object v2;
	/**研发时间*/
	Object cd;
	/**升级消耗黄金*/
	Object cost_cash;
	/**升级消耗稀土*/
	Object cost_earth;
	/**升级消耗钢材*/
	Object cost_steel;
	/**升级消耗石油*/
	Object cost_oil;
	/**升级奖励战斗力*/
	Object strength;
	/**奖励道具（道具ID,数量）*/
	Object exp;
	/**图标*/
	Object icon;
	
	
	
	/**﻿ID*/
	public int getID(){
		return ID;
	}
	/**名称（多语言配置表ID）*/
	public int getName(){
		return name;
	}
	/**功能描述（多语言配置表ID）*/
	public int getFeatures(){
		return features;
	}
	/**类型(分页类型1战争，2战略，3采集，子类型，1履式，2轮式，3直升机)*/
	@SuppressWarnings("unchecked")
	public <T> T getType(){
		return (T)type;
	}
	/**坐标（列，行）*/
	@SuppressWarnings("unchecked")
	public <T> T getColumn(){
		return (T)column;
	}
	/**最高等级*/
	public int getMax_lv(){
		return max_lv;
	}
	/**前置建筑（多个建筑用逗号分隔）*/
	@SuppressWarnings("unchecked")
	public <T> T getBuilding_id(){
		return (T)building_id;
	}
	/**解锁下一个科技需要的等级*/
	public int getUnlock_next_lv(){
		return unlock_next_lv;
	}
	/**前置科技*/
	@SuppressWarnings("unchecked")
	public <T> T getRequire_id(){
		return (T)require_id;
	}
	/**增加类型（不再使用）*/
	@SuppressWarnings("unchecked")
	public <T> T getType2(){
		return (T)type2;
	}
	/**V1（属性ID;）*/
	@SuppressWarnings("unchecked")
	public <T> T getV1(){
		return (T)v1;
	}
	/**V2（等级增加数值）*/
	@SuppressWarnings("unchecked")
	public <T> T getV2(){
		return (T)v2;
	}
	/**研发时间*/
	@SuppressWarnings("unchecked")
	public <T> T getCd(){
		return (T)cd;
	}
	/**升级消耗黄金*/
	@SuppressWarnings("unchecked")
	public <T> T getCost_cash(){
		return (T)cost_cash;
	}
	/**升级消耗稀土*/
	@SuppressWarnings("unchecked")
	public <T> T getCost_earth(){
		return (T)cost_earth;
	}
	/**升级消耗钢材*/
	@SuppressWarnings("unchecked")
	public <T> T getCost_steel(){
		return (T)cost_steel;
	}
	/**升级消耗石油*/
	@SuppressWarnings("unchecked")
	public <T> T getCost_oil(){
		return (T)cost_oil;
	}
	/**升级奖励战斗力*/
	@SuppressWarnings("unchecked")
	public <T> T getStrength(){
		return (T)strength;
	}
	/**奖励道具（道具ID,数量）*/
	@SuppressWarnings("unchecked")
	public <T> T getExp(){
		return (T)exp;
	}
	/**图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}