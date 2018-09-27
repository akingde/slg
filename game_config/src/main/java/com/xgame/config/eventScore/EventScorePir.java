package com.xgame.config.eventScore;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:20 
 */
public class EventScorePir extends BaseFilePri{
	
	/**﻿id*/
	int id;
	/**事件ID(1:军团战斗力提升（1D）2:领土争夺3:战斗力提升4:科研战斗力提升5:基地建设6:部队生产7:资源采集8:战争模拟器9:PVP（3H）10:PVP（1D）11:战斗力提升(3D))*/
	int type;
	/**积分段*/
	int scoreMin;
	/**积分段*/
	int scoreMax;
	/**基础分数*/
	int scorebase;
	/**青铜宝箱道具数量*/
	int rewardsNum1;
	/**白银宝箱道具数量*/
	int rewardsNum2;
	/**黄金宝箱道具数量*/
	int rewardsNum3;
	
	
	
	/**﻿id*/
	public int getId(){
		return id;
	}
	/**事件ID(1:军团战斗力提升（1D）2:领土争夺3:战斗力提升4:科研战斗力提升5:基地建设6:部队生产7:资源采集8:战争模拟器9:PVP（3H）10:PVP（1D）11:战斗力提升(3D))*/
	public int getType(){
		return type;
	}
	/**积分段*/
	public int getScoreMin(){
		return scoreMin;
	}
	/**积分段*/
	public int getScoreMax(){
		return scoreMax;
	}
	/**基础分数*/
	public int getScorebase(){
		return scorebase;
	}
	/**青铜宝箱道具数量*/
	public int getRewardsNum1(){
		return rewardsNum1;
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