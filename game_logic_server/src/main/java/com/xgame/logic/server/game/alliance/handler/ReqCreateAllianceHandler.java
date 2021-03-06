package com.xgame.logic.server.game.alliance.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.xgame.logic.server.core.net.process.PlayerCommand;
import com.xgame.logic.server.game.alliance.AllianceManager;
import com.xgame.logic.server.game.alliance.message.ReqCreateAllianceMessage;

/** 
 * @author messageGenerator
 * 
 * @version 1.0.0
 * 
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReqCreateAllianceHandler extends PlayerCommand<ReqCreateAllianceMessage>{

	@Autowired
	private AllianceManager allianceManager;
	
	@Override
    public void action() {
		allianceManager.createAlliance(player, message.allianceName, message.abbr, message.announce, message.icon, message.language);
    }
}
