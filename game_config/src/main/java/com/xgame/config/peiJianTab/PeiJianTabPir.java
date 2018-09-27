package com.xgame.config.peiJianTab;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class PeiJianTabPir extends BaseFilePri{
	
	/**﻿id*/
	int id;
	/**大兵种（1履带2轮式3战机）*/
	int type1;
	/**所属槽位（0底盘1行动槽位2炮塔槽位3主武器槽位4副武器槽位5弹药槽位6炮塔内部7车体外部8车体内部）*/
	int type5;
	/**配件组*/
	Object type6;
	/**配件组多语言ID*/
	Object type6Name;
	
	
	
	/**﻿id*/
	public int getId(){
		return id;
	}
	/**大兵种（1履带2轮式3战机）*/
	public int getType1(){
		return type1;
	}
	/**所属槽位（0底盘1行动槽位2炮塔槽位3主武器槽位4副武器槽位5弹药槽位6炮塔内部7车体外部8车体内部）*/
	public int getType5(){
		return type5;
	}
	/**配件组*/
	@SuppressWarnings("unchecked")
	public <T> T getType6(){
		return (T)type6;
	}
	/**配件组多语言ID*/
	@SuppressWarnings("unchecked")
	public <T> T getType6Name(){
		return (T)type6Name;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}