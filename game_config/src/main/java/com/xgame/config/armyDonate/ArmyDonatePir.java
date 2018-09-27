package com.xgame.config.armyDonate;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:17 
 */
public class ArmyDonatePir extends BaseFilePri{
	
	/**﻿捐献次数*/
	int num;
	/**捐献石油*/
	int cost_oil;
	/**捐献稀土*/
	int cost_earth;
	/**捐献钢材*/
	int cost_steel;
	/**捐献黄金*/
	int cost_cash;
	/**捐献钻石*/
	int cost_RMB;
	/**资源捐献-军团资金（石油稀土钢材黄金）*/
	int addArmyMoney1;
	/**资源捐献-军团贡献（石油稀土钢材黄金）*/
	int GX1_1;
	/**钻石捐献-军团资金*/
	int addArmyMoney2;
	/**钻石捐献-军团贡献*/
	int GX1_2;
	/**资源科研-科技经验（石油,稀土,钢材,黄金）*/
	int addExp1;
	/**资源科研-军团贡献（石油,稀土,钢材,黄金）*/
	int GX2_1;
	/**钻石科研-科技经验*/
	int addExp2;
	/**钻石科研-军团贡献*/
	int GX2_2;
	
	
	
	/**﻿捐献次数*/
	public int getNum(){
		return num;
	}
	/**捐献石油*/
	public int getCost_oil(){
		return cost_oil;
	}
	/**捐献稀土*/
	public int getCost_earth(){
		return cost_earth;
	}
	/**捐献钢材*/
	public int getCost_steel(){
		return cost_steel;
	}
	/**捐献黄金*/
	public int getCost_cash(){
		return cost_cash;
	}
	/**捐献钻石*/
	public int getCost_RMB(){
		return cost_RMB;
	}
	/**资源捐献-军团资金（石油稀土钢材黄金）*/
	public int getAddArmyMoney1(){
		return addArmyMoney1;
	}
	/**资源捐献-军团贡献（石油稀土钢材黄金）*/
	public int getGX1_1(){
		return GX1_1;
	}
	/**钻石捐献-军团资金*/
	public int getAddArmyMoney2(){
		return addArmyMoney2;
	}
	/**钻石捐献-军团贡献*/
	public int getGX1_2(){
		return GX1_2;
	}
	/**资源科研-科技经验（石油,稀土,钢材,黄金）*/
	public int getAddExp1(){
		return addExp1;
	}
	/**资源科研-军团贡献（石油,稀土,钢材,黄金）*/
	public int getGX2_1(){
		return GX2_1;
	}
	/**钻石科研-科技经验*/
	public int getAddExp2(){
		return addExp2;
	}
	/**钻石科研-军团贡献*/
	public int getGX2_2(){
		return GX2_2;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}