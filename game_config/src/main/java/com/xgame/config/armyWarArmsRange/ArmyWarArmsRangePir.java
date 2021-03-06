package com.xgame.config.armyWarArmsRange;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmyWarArmsRangePir extends BaseFilePri{
	
	/**﻿兵种ID1坦克2自行火炮3巡航导弹车4无人机战车7工程抢修车8地对空导弹车9地对地火箭车10导弹拦截车11步兵战车14电子战车15对空单点直升机16对地单点直升机17对地面伤直升机18特种直升机*/
	int armsId;
	/**回合移动最大格子数*/
	int moveRange;
	/**攻击距离*/
	int atkRange;
	
	
	
	/**﻿兵种ID1坦克2自行火炮3巡航导弹车4无人机战车7工程抢修车8地对空导弹车9地对地火箭车10导弹拦截车11步兵战车14电子战车15对空单点直升机16对地单点直升机17对地面伤直升机18特种直升机*/
	public int getArmsId(){
		return armsId;
	}
	/**回合移动最大格子数*/
	public int getMoveRange(){
		return moveRange;
	}
	/**攻击距离*/
	public int getAtkRange(){
		return atkRange;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}