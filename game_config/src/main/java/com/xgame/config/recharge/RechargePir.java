package com.xgame.config.recharge;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class RechargePir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**礼包名*/
	int name;
	/**描述*/
	int desc;
	/**礼包类型（1普通礼包，2新手礼包，3运营礼包，100首充奖励，99周月卡）*/
	int activityType;
	/**前置礼包id*/
	int requireId;
	/**限购次数（为空表示不限次数）*/
	int num;
	/**礼包重启（购买后N天重启:1_N，N天没购买某礼包重启:礼包id_N）*/
	Object return1;
	/**礼包排序*/
	int order;
	/**热卖标签*/
	int hot;
	/**充值额度（元）*/
	int recharge;
	/**充值钻石*/
	int gems;
	/**赠送钻石（钻石数量_天数）*/
	Object dailyGems;
	/**特殊显示*/
	Object show;
	/**背景板*/
	Object background;
	/**礼包奖励*/
	Object rewards;
	/**开启时间（周一到周日1,2,3,4,5,6,7）*/
	Object openDays;
	/**状态（0关1开）*/
	int status;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**礼包名*/
	public int getName(){
		return name;
	}
	/**描述*/
	public int getDesc(){
		return desc;
	}
	/**礼包类型（1普通礼包，2新手礼包，3运营礼包，100首充奖励，99周月卡）*/
	public int getActivityType(){
		return activityType;
	}
	/**前置礼包id*/
	public int getRequireId(){
		return requireId;
	}
	/**限购次数（为空表示不限次数）*/
	public int getNum(){
		return num;
	}
	/**礼包重启（购买后N天重启:1_N，N天没购买某礼包重启:礼包id_N）*/
	@SuppressWarnings("unchecked")
	public <T> T getReturn1(){
		return (T)return1;
	}
	/**礼包排序*/
	public int getOrder(){
		return order;
	}
	/**热卖标签*/
	public int getHot(){
		return hot;
	}
	/**充值额度（元）*/
	public int getRecharge(){
		return recharge;
	}
	/**充值钻石*/
	public int getGems(){
		return gems;
	}
	/**赠送钻石（钻石数量_天数）*/
	@SuppressWarnings("unchecked")
	public <T> T getDailyGems(){
		return (T)dailyGems;
	}
	/**特殊显示*/
	@SuppressWarnings("unchecked")
	public <T> T getShow(){
		return (T)show;
	}
	/**背景板*/
	@SuppressWarnings("unchecked")
	public <T> T getBackground(){
		return (T)background;
	}
	/**礼包奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards(){
		return (T)rewards;
	}
	/**开启时间（周一到周日1,2,3,4,5,6,7）*/
	@SuppressWarnings("unchecked")
	public <T> T getOpenDays(){
		return (T)openDays;
	}
	/**状态（0关1开）*/
	public int getStatus(){
		return status;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}