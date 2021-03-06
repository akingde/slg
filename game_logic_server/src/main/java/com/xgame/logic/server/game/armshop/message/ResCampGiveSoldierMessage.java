package com.xgame.logic.server.game.armshop.message;
import com.xgame.logic.server.game.armshop.bean.ArmsFactoryOwnBean;
import java.util.ArrayList;
import java.util.List;
import com.xgame.msglib.ResMessage;

import com.xgame.msglib.able.Communicationable;
import com.xgame.msglib.annotation.MsgField;
/** 
 * @author ProtocolEditor
 * Armshop-ResCampGiveSoldier - 创建建筑物
 */
public class ResCampGiveSoldierMessage extends ResMessage {
	
	//模块号+消息号
	public static final int ID=101102;
	//模块号
	public static final int FUNCTION_ID=101;
	//消息号
	public static final int MSG_ID=102;
	
	/***/
	@MsgField(Id = 1)
	public int buildUid;
	/**1生产 2是销毁*/
	@MsgField(Id = 2)
	public List<ArmsFactoryOwnBean> campownBeans = new ArrayList<ArmsFactoryOwnBean>();
		
	@Override
	public int getId() {
		return ID;
	}

	@Override
	public String getQueue() {
		return "s2s";
	}
	
	@Override
	public String getServer() {
		return null;
	}
	
	@Override
	public boolean isSync() {
		return false;
	}

	@Override
	public CommandEnum getCommandEnum() {
		return Communicationable.CommandEnum.PLAYERMSG;
	}
	
	@Override
	public HandlerEnum getHandlerEnum() {
		return Communicationable.HandlerEnum.SC;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		buf.append("buildUid:" + buildUid +",");
		buf.append("campownBeans:{");
		for (int i = 0; i < campownBeans.size(); i++) {
			buf.append(campownBeans.get(i).toString() +",");
		}
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("},");
		if(buf.charAt(buf.length()-1)==',') buf.deleteCharAt(buf.length()-1);
		buf.append("]");
		return buf.toString();
	}
}