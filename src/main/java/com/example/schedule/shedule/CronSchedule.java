package com.example.schedule.shedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronSchedule {
	
	@Scheduled(cron = "5 * * * * MON-THU")
	public void doSomething() {
		System.out.println("Do some thing");
	}
}
