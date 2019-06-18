package com.app.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyReportService {
	
	//@Scheduled(initialDelay =500,fixedDelay = 1000)
	//@Scheduled(initialDelayString= "2000" ,fixedRate = 200)
	@Scheduled(cron ="30 31 1 17 6 MON")
	public void showRepo() {
		System.out.println("Report Generated : "+new Date());
	}
}
