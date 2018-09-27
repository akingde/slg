package com.xgame.config.eventTrim;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:20 
 */
public class EventTrimPir extends BaseFilePri{
	
	/**﻿唯一id*/
	int id;
	/**事件ID(1:军团战斗力提升（1D）2:领土争夺3:战斗力提升4:科研战斗力提升5:基地建设6:部队生产7:资源采集8:战争模拟器9:PVP（3H）10:PVP（1D）11:战斗力提升(3D))*/
	int type;
	/**参数1（事件类型type=1或者2时，计算参数为军团当前人数，其余的为玩家的行政中心的等级）*/
	int paraMin;
	/**参数2*/
	int paraMax;
	/**积分倍数*/
	double scoreTimes;
	/**青铜宝箱道具数量*/
	int rewardsNumAdd1;
	/**白银宝箱道具数量*/
	int rewardsNum2;
	/**黄金宝箱道具数量*/
	int rewardsNum3;
	
	
	
	/**﻿唯一id*/
	public int getId(){
		return id;
	}
	/**事件ID(1:军团战斗力提升（1D）2:领土争夺3:战斗力提升4:科研战斗力提升5:基地建设6:部队生产7:资源采集8:战争模拟器9:PVP（3H）10:PVP（1D）11:战斗力提升(3D))*/
	public int getType(){
		return type;
	}
	/**参数1（事件类型type=1或者2时，计算参数为军团当前人数，其余的为玩家的行政中心的等级）*/
	public int getParaMin(){
		return paraMin;
	}
	/**参数2*/
	public int getParaMax(){
		return paraMax;
	}
	/**积分倍数*/
	public double getScoreTimes(){
		return scoreTimes;
	}
	/**青铜宝箱道具数量*/
	public int getRewardsNumAdd1(){
		return rewardsNumAdd1;
	}
	/**白银宝箱道具数量*/
	public int getRewardsNum2(){
		return rewardsNum2;
	}
	/**黄金宝箱道具数量*/
	public int getRewardsNum3(){
		return rewardsNum3;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}