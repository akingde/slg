package com.xgame.config.C100301;

import com.xgame.config.BasePriFactory;
import com.xgame.config.ConfParse;
/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-03-22 21:10:45 
 */
public class C100301PirFactory extends BasePriFactory<C100301Pir>{
	

	public void init(C100301Pir pir) {
		
	}
	
	@Override
	public void load(C100301Pir pir) {
		
	}
	
	
	
	
	
	
	
	@Override
	public C100301Pir newPri() {
		return new C100301Pir();
	}
	
	public static C100301Pir get(Object key) {
		return instance.factory.get(key);
	}
	
	/*  single instance*/
	/**
	 * 饿汉单列
	 */
	private static final C100301PirFactory instance = new C100301PirFactory(); 
	
	
	public static C100301PirFactory getInstance() {
		return instance;
	}
}