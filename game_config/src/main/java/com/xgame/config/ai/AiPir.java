package com.xgame.config.ai;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class AiPir extends BaseFilePri{
	
	/**﻿ai id(读配件表ai字段,建筑表ai字段)*/
	int id;
	/**是否优先反击*/
	int isBack;
	/**是否是飞行单位*/
	int isFly;
	/**是否能打墙*/
	int canShootWall;
	/**是否跃墙攻击*/
	int canShootOverWall;
	/**释放技能目标的阵营（1.敌方；2.自方）*/
	int targetCamp;
	/**可攻击的兵种（填入小兵种id_伤害加成,多个用分号分隔）*/
	Object attackTroops;
	/**可攻击的建筑（建筑表type字段)(0行政大楼，1军事建筑，2资源建筑，3地雷，4空中炸弹，5围墙，6防御塔,7障碍物，8其他)*/
	Object attackBuildings;
	/**优先攻击兵种*/
	Object priorityTroops;
	/**优先攻击建筑*/
	Object priorityBuildings;
	
	
	
	/**﻿ai id(读配件表ai字段,建筑表ai字段)*/
	public int getId(){
		return id;
	}
	/**是否优先反击*/
	public int getIsBack(){
		return isBack;
	}
	/**是否是飞行单位*/
	public int getIsFly(){
		return isFly;
	}
	/**是否能打墙*/
	public int getCanShootWall(){
		return canShootWall;
	}
	/**是否跃墙攻击*/
	public int getCanShootOverWall(){
		return canShootOverWall;
	}
	/**释放技能目标的阵营（1.敌方；2.自方）*/
	public int getTargetCamp(){
		return targetCamp;
	}
	/**可攻击的兵种（填入小兵种id_伤害加成,多个用分号分隔）*/
	@SuppressWarnings("unchecked")
	public <T> T getAttackTroops(){
		return (T)attackTroops;
	}
	/**可攻击的建筑（建筑表type字段)(0行政大楼，1军事建筑，2资源建筑，3地雷，4空中炸弹，5围墙，6防御塔,7障碍物，8其他)*/
	@SuppressWarnings("unchecked")
	public <T> T getAttackBuildings(){
		return (T)attackBuildings;
	}
	/**优先攻击兵种*/
	@SuppressWarnings("unchecked")
	public <T> T getPriorityTroops(){
		return (T)priorityTroops;
	}
	/**优先攻击建筑*/
	@SuppressWarnings("unchecked")
	public <T> T getPriorityBuildings(){
		return (T)priorityBuildings;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}