package com.xgame.config.skill;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:22 
 */
public class SkillPir extends BaseFilePri{
	
	/**﻿技能id*/
	int id;
	/**技能等级*/
	int skillLV;
	/**技能类型*/
	int skillGroupId;
	/**技能释放类型（1常规释放:获得目标后释放，2 出生即释放:无需目标(怪物用)）*/
	int releaseType;
	/**命中类型（1 战斗属性计算 2 固定命中率(数值读v1和v2 最终数值除10000) 3 特殊）*/
	int hitType;
	/**V1(V1+V2*技能LV)技能概率参数，没有则填0*/
	int value1;
	/**V2技能概率参数，没有则填0*/
	int value2;
	/**敌方（buff释放对象，有多人用分号分隔）*/
	Object buffEnemy;
	/**友方（不包含自己)*/
	Object buffFriend;
	/**自己(无条释放)*/
	Object buffSelf;
	/**主人(无条释放)*/
	Object buffMaster;
	/**后续技能ID（释放完当前技能后再释放后续技能）*/
	Object nextSkill;
	/**飞行特效 */
	Object fxShoot;
	/**受体特效路径*/
	Object fxHit;
	/**炮弹飞行速度   */
	int bulletSpeed ;
	/**cd时间内的攻击频率  毫秒（1000/x）*/
	int attackRate ;
	/**弹药装填时间  CD时间  毫秒*/
	int reloadTime ;
	/**每次cd内的最大攻击次数（一个技能发射几发子弹，有些需要与模型匹配）*/
	int attackNum ;
	/**持续伤害时间间隔  毫秒 （填0表示不是持续伤害）*/
	int damageCD ;
	/**攻击距离（单位 格子）*/
	int attackLen ;
	/**伤害区域类型 , 如果为0则是单点攻击，如果不为0 , 则是填入的数值表示半径为N的圆形范围攻击 ( 非范围攻击的, 如果目标 为null 则终止攻击行为)(填入1.5表示对半径为1.5个格子的圆形为攻击半径 )*/
	double areaType ;
	/**是否制导(0不自导，1自导) , 如果不制导 , 那么伤害计算是攻击时间达到时(距离/速度) , 运动是锁定的开始时确定的坐标 , 而不是人 ;  如果是制导类型的 , 那么伤害计算是在子弹到达后 , 根据当前子弹位置以及攻击范围和范围类型 , 看看哪些会是我的目标, 给其加buff , 锁定的是人*/
	int isGuide ;
	/**是否可被拦截*/
	int isBlock;
	/**是否可被诱饵*/
	int isBait;
	/**首次攻击后是否结束攻击（0不结束，1结束） , 用于阻挡式攻击, 打到第一个人后就消失*/
	int stopAttackAfterFirstImpact ;
	/**技能的发起时长 发起动作和 发起特效 毫秒*/
	int shootStartDuration ;
	/**技能伤害持续时间*/
	int shootProcessDuration;
	/**技能的结束时长  结束动作播放 毫秒*/
	int shootFinishDuration ;
	/**技能总时长增量 , 在shootStartDuration + shootProcessDuration +shootEndDuration 的总和时间 的基础上增加 , 用于受体特效展现等*/
	int lifeTimeAddtive ;
	/**技能 射击运动(Process) 是否依赖发起结束（0不依赖，1依赖）*/
	int shootAfterStart ;
	/**有多个主武器时 , 主武器的开始攻击间隔时间 , 毫秒*/
	int mainWeaponShootInterval;
	/**攻击音效(声音名;播放时长|声音名;播放时长)*/
	Object shootSound;
	/**被击音效*/
	Object hitSound;
	
	
	
	/**﻿技能id*/
	public int getId(){
		return id;
	}
	/**技能等级*/
	public int getSkillLV(){
		return skillLV;
	}
	/**技能类型*/
	public int getSkillGroupId(){
		return skillGroupId;
	}
	/**技能释放类型（1常规释放:获得目标后释放，2 出生即释放:无需目标(怪物用)）*/
	public int getReleaseType(){
		return releaseType;
	}
	/**命中类型（1 战斗属性计算 2 固定命中率(数值读v1和v2 最终数值除10000) 3 特殊）*/
	public int getHitType(){
		return hitType;
	}
	/**V1(V1+V2*技能LV)技能概率参数，没有则填0*/
	public int getValue1(){
		return value1;
	}
	/**V2技能概率参数，没有则填0*/
	public int getValue2(){
		return value2;
	}
	/**敌方（buff释放对象，有多人用分号分隔）*/
	@SuppressWarnings("unchecked")
	public <T> T getBuffEnemy(){
		return (T)buffEnemy;
	}
	/**友方（不包含自己)*/
	@SuppressWarnings("unchecked")
	public <T> T getBuffFriend(){
		return (T)buffFriend;
	}
	/**自己(无条释放)*/
	@SuppressWarnings("unchecked")
	public <T> T getBuffSelf(){
		return (T)buffSelf;
	}
	/**主人(无条释放)*/
	@SuppressWarnings("unchecked")
	public <T> T getBuffMaster(){
		return (T)buffMaster;
	}
	/**后续技能ID（释放完当前技能后再释放后续技能）*/
	@SuppressWarnings("unchecked")
	public <T> T getNextSkill(){
		return (T)nextSkill;
	}
	/**飞行特效 */
	@SuppressWarnings("unchecked")
	public <T> T getFxShoot(){
		return (T)fxShoot;
	}
	/**受体特效路径*/
	@SuppressWarnings("unchecked")
	public <T> T getFxHit(){
		return (T)fxHit;
	}
	/**炮弹飞行速度   */
	public int getBulletSpeed (){
		return bulletSpeed ;
	}
	/**cd时间内的攻击频率  毫秒（1000/x）*/
	public int getAttackRate (){
		return attackRate ;
	}
	/**弹药装填时间  CD时间  毫秒*/
	public int getReloadTime (){
		return reloadTime ;
	}
	/**每次cd内的最大攻击次数（一个技能发射几发子弹，有些需要与模型匹配）*/
	public int getAttackNum (){
		return attackNum ;
	}
	/**持续伤害时间间隔  毫秒 （填0表示不是持续伤害）*/
	public int getDamageCD (){
		return damageCD ;
	}
	/**攻击距离（单位 格子）*/
	public int getAttackLen (){
		return attackLen ;
	}
	/**伤害区域类型 , 如果为0则是单点攻击，如果不为0 , 则是填入的数值表示半径为N的圆形范围攻击 ( 非范围攻击的, 如果目标 为null 则终止攻击行为)(填入1.5表示对半径为1.5个格子的圆形为攻击半径 )*/
	public double getAreaType (){
		return areaType ;
	}
	/**是否制导(0不自导，1自导) , 如果不制导 , 那么伤害计算是攻击时间达到时(距离/速度) , 运动是锁定的开始时确定的坐标 , 而不是人 ;  如果是制导类型的 , 那么伤害计算是在子弹到达后 , 根据当前子弹位置以及攻击范围和范围类型 , 看看哪些会是我的目标, 给其加buff , 锁定的是人*/
	public int getIsGuide (){
		return isGuide ;
	}
	/**是否可被拦截*/
	public int getIsBlock(){
		return isBlock;
	}
	/**是否可被诱饵*/
	public int getIsBait(){
		return isBait;
	}
	/**首次攻击后是否结束攻击（0不结束，1结束） , 用于阻挡式攻击, 打到第一个人后就消失*/
	public int getStopAttackAfterFirstImpact (){
		return stopAttackAfterFirstImpact ;
	}
	/**技能的发起时长 发起动作和 发起特效 毫秒*/
	public int getShootStartDuration (){
		return shootStartDuration ;
	}
	/**技能伤害持续时间*/
	public int getShootProcessDuration(){
		return shootProcessDuration;
	}
	/**技能的结束时长  结束动作播放 毫秒*/
	public int getShootFinishDuration (){
		return shootFinishDuration ;
	}
	/**技能总时长增量 , 在shootStartDuration + shootProcessDuration +shootEndDuration 的总和时间 的基础上增加 , 用于受体特效展现等*/
	public int getLifeTimeAddtive (){
		return lifeTimeAddtive ;
	}
	/**技能 射击运动(Process) 是否依赖发起结束（0不依赖，1依赖）*/
	public int getShootAfterStart (){
		return shootAfterStart ;
	}
	/**有多个主武器时 , 主武器的开始攻击间隔时间 , 毫秒*/
	public int getMainWeaponShootInterval(){
		return mainWeaponShootInterval;
	}
	/**攻击音效(声音名;播放时长|声音名;播放时长)*/
	@SuppressWarnings("unchecked")
	public <T> T getShootSound(){
		return (T)shootSound;
	}
	/**被击音效*/
	@SuppressWarnings("unchecked")
	public <T> T getHitSound(){
		return (T)hitSound;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}