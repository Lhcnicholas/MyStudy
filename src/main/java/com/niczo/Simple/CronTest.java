package com.niczo.Simple;

import org.quartz.CronExpression;

import java.text.ParseException;
import java.util.Date;

public class CronTest implements Test{

	@Override
	public void test() {
//		CronTrigger trigger = new CronTrigger("0 0 1 20 3 ? *");
//		SimpleTriggerContext context = new SimpleTriggerContext();
//		context.update(new Date(), new Date(), new Date());
//		System.out.println(trigger.nextExecutionTime(context));
//		System.out.println(trigger.nextExecutionTime(context));

		try {
			CronExpression a = new CronExpression("0 40 15 11 * ?");
			System.out.println(a.getNextValidTimeAfter(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}


	}
}
