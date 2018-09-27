package com.xgame.config.talent;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:22 
 */
public class TalentPir extends BaseFilePri{
	
	/**﻿天赋id   */
	int id;
	/**天赋页(1:天赋一，2：天赋二)*/
	int book;
	/**天赋名字id   */
	int name_id;
	/**天赋描述id   */
	int des_id;
	/**天赋类型   1:战斗，2：发展，3：辅助*/
	int type;
	/**天赋图标   */
	Object icon;
	/**所在列   */
	int column;
	/**所在行   */
	int row;
	/**解锁下一个天赋需要的等级*/
	int unlock_next_lv;
	/**前置天赋id   可填多个*/
	Object pre_id;
	/**增加类型（不再使用）*/
	Object target;
	/**天赋等级   */
	int max_lv;
	/**天赋每级增加属性   填入属性id和具体数值*/
	Object attr;
	/**升级奖励战力值   */
	Object gs_bonus;
	
	
	
	/**﻿天赋id   */
	public int getId(){
		return id;
	}
	/**天赋页(1:天赋一，2：天赋二)*/
	public int getBook(){
		return book;
	}
	/**天赋名字id   */
	public int getName_id(){
		return name_id;
	}
	/**天赋描述id   */
	public int getDes_id(){
		return des_id;
	}
	/**天赋类型   1:战斗，2：发展，3：辅助*/
	public int getType(){
		return type;
	}
	/**天赋图标   */
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**所在列   */
	public int getColumn(){
		return column;
	}
	/**所在行   */
	public int getRow(){
		return row;
	}
	/**解锁下一个天赋需要的等级*/
	public int getUnlock_next_lv(){
		return unlock_next_lv;
	}
	/**前置天赋id   可填多个*/
	@SuppressWarnings("unchecked")
	public <T> T getPre_id(){
		return (T)pre_id;
	}
	/**增加类型（不再使用）*/
	@SuppressWarnings("unchecked")
	public <T> T getTarget(){
		return (T)target;
	}
	/**天赋等级   */
	public int getMax_lv(){
		return max_lv;
	}
	/**天赋每级增加属性   填入属性id和具体数值*/
	@SuppressWarnings("unchecked")
	public <T> T getAttr(){
		return (T)attr;
	}
	/**升级奖励战力值   */
	@SuppressWarnings("unchecked")
	public <T> T getGs_bonus(){
		return (T)gs_bonus;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}