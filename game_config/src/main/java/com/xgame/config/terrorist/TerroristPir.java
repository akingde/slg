package com.xgame.config.terrorist;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:22 
 */
public class TerroristPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**恐怖分子名（多语言）*/
	int name;
	/**恐怖分子类型（1普通 2堡垒）*/
	int type;
	/**恐怖分子等级*/
	int lv;
	/**野外图片ID*/
	Object showId;
	/**对应副本数据（txt文件名）*/
	int copyFile;
	/**击杀奖励*/
	Object rewards;
	/**掉落展示(最多只能配4个)*/
	Object rewardShow;
	/**推荐部队描述（多语言）*/
	int desc1;
	/**进攻所需体力*/
	int tiLi;
	/**通缉令图标*/
	Object icon;
	/**图标在UI坐标*/
	Object XY;
	/**通缉令奖励(只可领取1次)*/
	Object fristRewards;
	/**通缉令描述*/
	int desc2;
	/**逃跑时间*/
	int time;
	/**全服数量*/
	int num;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**恐怖分子名（多语言）*/
	public int getName(){
		return name;
	}
	/**恐怖分子类型（1普通 2堡垒）*/
	public int getType(){
		return type;
	}
	/**恐怖分子等级*/
	public int getLv(){
		return lv;
	}
	/**野外图片ID*/
	@SuppressWarnings("unchecked")
	public <T> T getShowId(){
		return (T)showId;
	}
	/**对应副本数据（txt文件名）*/
	public int getCopyFile(){
		return copyFile;
	}
	/**击杀奖励*/
	@SuppressWarnings("unchecked")
	public <T> T getRewards(){
		return (T)rewards;
	}
	/**掉落展示(最多只能配4个)*/
	@SuppressWarnings("unchecked")
	public <T> T getRewardShow(){
		return (T)rewardShow;
	}
	/**推荐部队描述（多语言）*/
	public int getDesc1(){
		return desc1;
	}
	/**进攻所需体力*/
	public int getTiLi(){
		return tiLi;
	}
	/**通缉令图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**图标在UI坐标*/
	@SuppressWarnings("unchecked")
	public <T> T getXY(){
		return (T)XY;
	}
	/**通缉令奖励(只可领取1次)*/
	@SuppressWarnings("unchecked")
	public <T> T getFristRewards(){
		return (T)fristRewards;
	}
	/**通缉令描述*/
	public int getDesc2(){
		return desc2;
	}
	/**逃跑时间*/
	public int getTime(){
		return time;
	}
	/**全服数量*/
	public int getNum(){
		return num;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}