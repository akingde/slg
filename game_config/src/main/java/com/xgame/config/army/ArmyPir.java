package com.xgame.config.army;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmyPir extends BaseFilePri{
	
	/**﻿军团等级*/
	int armyLv;
	/**消耗资金*/
	int cost_armyMoney;
	/**人数上限*/
	int armyMax;
	/**战队人数上限*/
	int teamMax;
	
	
	
	/**﻿军团等级*/
	public int getArmyLv(){
		return armyLv;
	}
	/**消耗资金*/
	public int getCost_armyMoney(){
		return cost_armyMoney;
	}
	/**人数上限*/
	public int getArmyMax(){
		return armyMax;
	}
	/**战队人数上限*/
	public int getTeamMax(){
		return teamMax;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}