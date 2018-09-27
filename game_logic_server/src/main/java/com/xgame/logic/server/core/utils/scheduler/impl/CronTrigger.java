package com.xgame.logic.server.core.utils.scheduler.impl;

import java.util.Date;
import java.util.TimeZone;

import org.springframework.scheduling.support.CronSequenceGenerator;

import com.xgame.logic.server.core.utils.scheduler.TaskContext;
import com.xgame.logic.server.core.utils.scheduler.Trigger;

/**
 * Cron定时表达式触发器
 * @author jacky.jiang
 */
public class CronTrigger implements Trigger {

	private final CronSequenceGenerator sequenceGenerator;

	public CronTrigger(String expression) {
		this(expression, TimeZone.getDefault());
	}

	public CronTrigger(String cronExpression, TimeZone timeZone) {
		this.sequenceGenerator = new CronSequenceGenerator(cronExpression, timeZone);
	}

	@Override
	public Date nextTime(TaskContext context) {
		Date date = context.lastCompletionTime();
		if (date != null) {
			Date scheduled = context.lastScheduledTime();
			if (scheduled != null && date.before(scheduled)) {
				date = scheduled;
			}
		} else {
			date = new Date();
		}
		
		Date result = this.sequenceGenerator.next(date);
		return result;
	}

}
