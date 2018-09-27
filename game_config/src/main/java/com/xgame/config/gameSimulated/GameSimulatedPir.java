package com.xgame.config.gameSimulated;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class GameSimulatedPir extends BaseFilePri{
	
	/**﻿奖励ID*/
	int id;
	/**模式（1普通模式，2高级模式）*/
	int mode;
	/**奖励权重*/
	int weight;
	/**第1段奖励*/
	Object rewards1;
	/**第2段奖励*/
	Object rewards2;
	/**第3段奖励*/
	Object rewards3;
	/**第4段奖励*/
	Object rewards4;
	/**第1段成功率*/
	double pro1;
	/**第2段成功率*/
	double pro2;
	/**第3段成功率*/
	double pro3;
	/**第4段成功率*/
	double pro4;
	/**第1段必成消耗*/
	int cost1;
	/**第2段必成消耗*/
	int cost2;
	/**第3段必成消耗*/
	int cost3;
	/**第4段必成消耗*/
	int cost4;
	
	
	
	/**﻿奖励ID*/
	public int getId(){
		return id;
	}
	/**模式（1普通模式，2高级模式）*/
	public int getMode(){
		return mode;
	}
	/**奖励权重*/
	public int getWeight(){
		return weight;
	}
	/**第1段奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards1(){
		return (T)rewards1;
	}
	/**第2段奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards2(){
		return (T)rewards2;
	}
	/**第3段奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards3(){
		return (T)rewards3;
	}
	/**第4段奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards4(){
		return (T)rewards4;
	}
	/**第1段成功率*/
	public double getPro1(){
		return pro1;
	}
	/**第2段成功率*/
	public double getPro2(){
		return pro2;
	}
	/**第3段成功率*/
	public double getPro3(){
		return pro3;
	}
	/**第4段成功率*/
	public double getPro4(){
		return pro4;
	}
	/**第1段必成消耗*/
	public int getCost1(){
		return cost1;
	}
	/**第2段必成消耗*/
	public int getCost2(){
		return cost2;
	}
	/**第3段必成消耗*/
	public int getCost3(){
		return cost3;
	}
	/**第4段必成消耗*/
	public int getCost4(){
		return cost4;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}