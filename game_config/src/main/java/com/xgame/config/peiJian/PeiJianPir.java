package com.xgame.config.peiJian;
import com.xgame.config.BaseFilePri;
import com.alibaba.fastjson.JSON;

/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-12 09:54:21 
 */
public class PeiJianPir extends BaseFilePri{
	
	/**﻿ID*/
	int id;
	/**名字*/
	int name;
	/**描述*/
	int desc;
	/**图标*/
	Object icon;
	/**品质（1白2绿3蓝4紫5橙6红）*/
	int quality;
	/**模型ID*/
	Object showId;
	/**装饰动作脚本ID（无用）*/
	Object ACTId;
	/**大兵种（1履带2轮式3战机）*/
	int type1;
	/**小兵种ID（1坦克2自行火炮3巡航导弹车4无人机战车5空对地小型空中单位6空对空小型空中单位7工程抢修车8地对空导弹车9地对地火箭车10导弹拦截车11步兵战车12机枪步兵13防空步兵14电子战车15对空单点直升机16对地单点直升机17对地面伤直升机18特种直升机 19 爆破特种兵，20EMP特种兵，21奇袭特种兵，22工程特种兵)*/
	int type2;
	/**地面or空中1地面2空中*/
	int type3;
	/**单位大小(1小2中3大)*/
	int type4;
	/**所属槽位（0底盘1行动槽位2炮塔槽位3主武器槽位4副武器槽位5弹药槽位6炮塔内部7车体外部8车体内部）*/
	int type5;
	/**配件组*/
	int type6;
	/**技能ID(多个技能id用分号分隔)（只主武器和副武器有技能）*/
	Object SkillId;
	/**行动部分槽位*/
	int cao1;
	/**炮塔槽位*/
	int cao2;
	/**主武器槽位*/
	Object cao3;
	/**副武器槽位*/
	int cao4;
	/**弹药槽位*/
	Object cao5;
	/**炮塔内部槽位*/
	int cao6;
	/**车体外部槽位*/
	int cao7;
	/**车体内部槽位*/
	int cao8;
	/**水平旋转*/
	Object shuiPing;
	/**垂直旋转*/
	int chuiZhi;
	/**配件属性(指向对象填-1表示指向自己)*/
	Object attr;
	/**生产士兵时间(1个N秒)*/
	double time;
	/**生产士兵消耗资源1*/
	double cost_cash;
	/**生产士兵消耗资源2*/
	double cost_earth;
	/**生产士兵消耗资源3*/
	double cost_steel;
	/**生产士兵消耗资源4*/
	double cost_oil;
	/**修理士兵时间(1个N秒)*/
	double fix_time;
	/**修理士兵消耗资源*/
	double fix_cost_cash;
	/**修理士兵消耗资源*/
	double fix_cost_earth;
	/**修理士兵消耗资源*/
	double fix_cost_steel;
	/**修理士兵消耗资源*/
	double fix_cost_oil;
	/**军营中的士兵消耗石油（每小时）*/
	double camp_cost_oil;
	/**战斗消耗石油（每小时）*/
	double fight_cost_oil;
	/**战斗模型缩放*/
	double model1;
	/**UI缩放比例*/
	double UI1;
	/**UI偏移*/
	double UI2;
	/**配件等级（用于衰减排序）*/
	int lv;
	/**属性衰减（装配相同配置组会产生属性衰减，填入0表示不衰减）（第一个衰减比例%；第二个衰减比例%；第三个衰减比例%）(按照配件等级进行降序排列)*/
	Object decay;
	/**属性是否加入车体中（不再使用）*/
	int is_attr_count;
	/**饼图_结构*/
	int pie_type_1;
	/**饼图_机动*/
	int pie_type_2;
	/**饼图_装甲*/
	int pie_type_3;
	/**饼图_索敌*/
	int pie_type_4;
	/**饼图_火力*/
	int pie_type_5;
	/**对地*/
	double pie_type_6;
	/**对空*/
	double pie_type_7;
	/**战力（不再使用，使用公式计算）*/
	int gs_bonus;
	/**拼接方向（顺时针1-8）*/
	int fangXiang;
	/**配件组多语言ID*/
	int type6Name;
	/**兵种AI类型（只主武器和副武器有AI类型）*/
	int ai;
	/**战地尺寸（单位：格子）*/
	double size;
	/**奖励权重*/
	int weight;
	/**用于技能区分受体特效/音效材质分类（1 土木 2 混凝土 3 玻璃 4 钢材 5 血肉。。。随意加 ）*/
	int material;
	/**死亡音效(;随机，多主武器的时候 以lv列最高值为准)*/
	Object deathSound;
	/**死亡特效(;随机，多主武器的时候 以lv列最高值为准)*/
	Object deathEffect;
	
	
	
	/**﻿ID*/
	public int getId(){
		return id;
	}
	/**名字*/
	public int getName(){
		return name;
	}
	/**描述*/
	public int getDesc(){
		return desc;
	}
	/**图标*/
	@SuppressWarnings("unchecked")
	public <T> T getIcon(){
		return (T)icon;
	}
	/**品质（1白2绿3蓝4紫5橙6红）*/
	public int getQuality(){
		return quality;
	}
	/**模型ID*/
	@SuppressWarnings("unchecked")
	public <T> T getShowId(){
		return (T)showId;
	}
	/**装饰动作脚本ID（无用）*/
	@SuppressWarnings("unchecked")
	public <T> T getACTId(){
		return (T)ACTId;
	}
	/**大兵种（1履带2轮式3战机）*/
	public int getType1(){
		return type1;
	}
	/**小兵种ID（1坦克2自行火炮3巡航导弹车4无人机战车5空对地小型空中单位6空对空小型空中单位7工程抢修车8地对空导弹车9地对地火箭车10导弹拦截车11步兵战车12机枪步兵13防空步兵14电子战车15对空单点直升机16对地单点直升机17对地面伤直升机18特种直升机 19 爆破特种兵，20EMP特种兵，21奇袭特种兵，22工程特种兵)*/
	public int getType2(){
		return type2;
	}
	/**地面or空中1地面2空中*/
	public int getType3(){
		return type3;
	}
	/**单位大小(1小2中3大)*/
	public int getType4(){
		return type4;
	}
	/**所属槽位（0底盘1行动槽位2炮塔槽位3主武器槽位4副武器槽位5弹药槽位6炮塔内部7车体外部8车体内部）*/
	public int getType5(){
		return type5;
	}
	/**配件组*/
	public int getType6(){
		return type6;
	}
	/**技能ID(多个技能id用分号分隔)（只主武器和副武器有技能）*/
	@SuppressWarnings("unchecked")
	public <T> T getSkillId(){
		return (T)SkillId;
	}
	/**行动部分槽位*/
	public int getCao1(){
		return cao1;
	}
	/**炮塔槽位*/
	public int getCao2(){
		return cao2;
	}
	/**主武器槽位*/
	@SuppressWarnings("unchecked")
	public <T> T getCao3(){
		return (T)cao3;
	}
	/**副武器槽位*/
	public int getCao4(){
		return cao4;
	}
	/**弹药槽位*/
	@SuppressWarnings("unchecked")
	public <T> T getCao5(){
		return (T)cao5;
	}
	/**炮塔内部槽位*/
	public int getCao6(){
		return cao6;
	}
	/**车体外部槽位*/
	public int getCao7(){
		return cao7;
	}
	/**车体内部槽位*/
	public int getCao8(){
		return cao8;
	}
	/**水平旋转*/
	@SuppressWarnings("unchecked")
	public <T> T getShuiPing(){
		return (T)shuiPing;
	}
	/**垂直旋转*/
	public int getChuiZhi(){
		return chuiZhi;
	}
	/**配件属性(指向对象填-1表示指向自己)*/
	@SuppressWarnings("unchecked")
	public <T> T getAttr(){
		return (T)attr;
	}
	/**生产士兵时间(1个N秒)*/
	public double getTime(){
		return time;
	}
	/**生产士兵消耗资源1*/
	public double getCost_cash(){
		return cost_cash;
	}
	/**生产士兵消耗资源2*/
	public double getCost_earth(){
		return cost_earth;
	}
	/**生产士兵消耗资源3*/
	public double getCost_steel(){
		return cost_steel;
	}
	/**生产士兵消耗资源4*/
	public double getCost_oil(){
		return cost_oil;
	}
	/**修理士兵时间(1个N秒)*/
	public double getFix_time(){
		return fix_time;
	}
	/**修理士兵消耗资源*/
	public double getFix_cost_cash(){
		return fix_cost_cash;
	}
	/**修理士兵消耗资源*/
	public double getFix_cost_earth(){
		return fix_cost_earth;
	}
	/**修理士兵消耗资源*/
	public double getFix_cost_steel(){
		return fix_cost_steel;
	}
	/**修理士兵消耗资源*/
	public double getFix_cost_oil(){
		return fix_cost_oil;
	}
	/**军营中的士兵消耗石油（每小时）*/
	public double getCamp_cost_oil(){
		return camp_cost_oil;
	}
	/**战斗消耗石油（每小时）*/
	public double getFight_cost_oil(){
		return fight_cost_oil;
	}
	/**战斗模型缩放*/
	public double getModel1(){
		return model1;
	}
	/**UI缩放比例*/
	public double getUI1(){
		return UI1;
	}
	/**UI偏移*/
	public double getUI2(){
		return UI2;
	}
	/**配件等级（用于衰减排序）*/
	public int getLv(){
		return lv;
	}
	/**属性衰减（装配相同配置组会产生属性衰减，填入0表示不衰减）（第一个衰减比例%；第二个衰减比例%；第三个衰减比例%）(按照配件等级进行降序排列)*/
	@SuppressWarnings("unchecked")
	public <T> T getDecay(){
		return (T)decay;
	}
	/**属性是否加入车体中（不再使用）*/
	public int getIs_attr_count(){
		return is_attr_count;
	}
	/**饼图_结构*/
	public int getPie_type_1(){
		return pie_type_1;
	}
	/**饼图_机动*/
	public int getPie_type_2(){
		return pie_type_2;
	}
	/**饼图_装甲*/
	public int getPie_type_3(){
		return pie_type_3;
	}
	/**饼图_索敌*/
	public int getPie_type_4(){
		return pie_type_4;
	}
	/**饼图_火力*/
	public int getPie_type_5(){
		return pie_type_5;
	}
	/**对地*/
	public double getPie_type_6(){
		return pie_type_6;
	}
	/**对空*/
	public double getPie_type_7(){
		return pie_type_7;
	}
	/**战力（不再使用，使用公式计算）*/
	public int getGs_bonus(){
		return gs_bonus;
	}
	/**拼接方向（顺时针1-8）*/
	public int getFangXiang(){
		return fangXiang;
	}
	/**配件组多语言ID*/
	public int getType6Name(){
		return type6Name;
	}
	/**兵种AI类型（只主武器和副武器有AI类型）*/
	public int getAi(){
		return ai;
	}
	/**战地尺寸（单位：格子）*/
	public double getSize(){
		return size;
	}
	/**奖励权重*/
	public int getWeight(){
		return weight;
	}
	/**用于技能区分受体特效/音效材质分类（1 土木 2 混凝土 3 玻璃 4 钢材 5 血肉。。。随意加 ）*/
	public int getMaterial(){
		return material;
	}
	/**死亡音效(;随机，多主武器的时候 以lv列最高值为准)*/
	@SuppressWarnings("unchecked")
	public <T> T getDeathSound(){
		return (T)deathSound;
	}
	/**死亡特效(;随机，多主武器的时候 以lv列最高值为准)*/
	@SuppressWarnings("unchecked")
	public <T> T getDeathEffect(){
		return (T)deathEffect;
	}
	
	
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
}