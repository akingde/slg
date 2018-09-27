package com.xgame.config.armyWarRankingArmyAward;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmyWarRankingArmyAwardPir extends BaseFilePri{
	
	/**﻿奖励ID*/
	int id;
	/**排名1*/
	int ranking1;
	/**排名2*/
	int ranking2;
	/**奖励ID*/
	Object award;
	
	
	
	/**﻿奖励ID*/
	public int getId(){
		return id;
	}
	/**排名1*/
	public int getRanking1(){
		return ranking1;
	}
	/**排名2*/
	public int getRanking2(){
		return ranking2;
	}
	/**奖励ID*/
	@SuppressWarnings("unchecked")
	public <T> T getAward(){
		return (T)award;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}