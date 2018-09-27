package com.xgame.config.attrBonusSource;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
<<<<<<< .mine
 * @date 2017-05-12 09:54:17 
||||||| .r9463
 * @date 2017-03-31 16:47:42 
=======
 * @date 2017-05-19 15:17:57 
>>>>>>> .r11483
 */
public class AttrBonusSourcePir extends BaseFilePri{
	
	/**﻿增益类型id*/
	int id;
	/**属性id*/
	int  attr_id;
	/**名字id*/
	int  name_id;
	/**统计类型（1战争，2战略 3采集）*/
	int type;
	/**对象id（0：建筑 1：坦克 2：战车 3 飞机 4 玩家）*/
	int target_id;
	/**建筑(填0表示无改来源，填1表有)*/
	int source_0;
	/**指挥官天赋(填0表示无改来源，填1表有)*/
	int source_1;
	/**植入体(填0表示无改来源，填1表有)*/
	int source_2;
	/**科技(填0表示无改来源，填1表有)*/
	int source_3;
	/**道具*/
	int source_4;
	/**雷达*/
	int source_5;
	/**联盟科技*/
	int source_6;
	/**VIP*/
	int source_7;
	
	
	
	/**﻿增益类型id*/
	public int getId(){
		return id;
	}
	/**属性id*/
	public int  getAttr_id(){
		return attr_id;
	}
	/**名字id*/
	public int  getName_id(){
		return name_id;
	}
	/**统计类型（1战争，2战略 3采集）*/
	public int getType(){
		return type;
	}
	/**对象id（0：建筑 1：坦克 2：战车 3 飞机 4 玩家）*/
	public int getTarget_id(){
		return target_id;
	}
	/**建筑(填0表示无改来源，填1表有)*/
	public int getSource_0(){
		return source_0;
	}
	/**指挥官天赋(填0表示无改来源，填1表有)*/
	public int getSource_1(){
		return source_1;
	}
	/**植入体(填0表示无改来源，填1表有)*/
	public int getSource_2(){
		return source_2;
	}
	/**科技(填0表示无改来源，填1表有)*/
	public int getSource_3(){
		return source_3;
	}
	/**道具*/
	public int getSource_4(){
		return source_4;
	}
	/**雷达*/
	public int getSource_5(){
		return source_5;
	}
	/**联盟科技*/
	public int getSource_6(){
		return source_6;
	}
	/**VIP*/
	public int getSource_7(){
		return source_7;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}