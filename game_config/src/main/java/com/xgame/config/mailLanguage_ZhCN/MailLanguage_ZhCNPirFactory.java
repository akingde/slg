package com.xgame.config.mailLanguage_ZhCN;

import com.xgame.config.BasePriFactory;
import com.xgame.config.ConfParse;
/** 
 * @author configTool
 * 
 * @version 1.0.0
 * @date 2017-05-19 15:18:03 
 */
public class MailLanguage_ZhCNPirFactory extends BasePriFactory<MailLanguage_ZhCNPir>{
	

	public void init(MailLanguage_ZhCNPir pir) {
		
	}
	
	@Override
	public void load(MailLanguage_ZhCNPir pir) {
		
	}
	
	
	
	/**
	 *自定义解析  title
	 */
	@ConfParse("title")
	public void titlePares(String conf,MailLanguage_ZhCNPir pir){
		
	}
	
	/**
	 *自定义解析  content
	 */
	@ConfParse("content")
	public void contentPares(String conf,MailLanguage_ZhCNPir pir){
		
	}
	
	/**
	 *自定义解析  main
	 */
	@ConfParse("main")
	public void mainPares(String conf,MailLanguage_ZhCNPir pir){
		
	}
	
	
	
	/**
	 *自定义解析  icon1
	 */
	@ConfParse("icon1")
	public void icon1Pares(String conf,MailLanguage_ZhCNPir pir){
		
	}
	
	@Override
	public MailLanguage_ZhCNPir newPri() {
		return new MailLanguage_ZhCNPir();
	}
	
	public static MailLanguage_ZhCNPir get(Object key) {
		return instance.factory.get(key);
	}
	
	/*  single instance*/
	/**
	 * 饿汉单列
	 */
	private static final MailLanguage_ZhCNPirFactory instance = new MailLanguage_ZhCNPirFactory(); 
	
	
	public static MailLanguage_ZhCNPirFactory getInstance() {
		return instance;
	}
}