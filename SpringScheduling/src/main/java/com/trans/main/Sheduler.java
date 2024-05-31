package com.trans.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sheduler {

	@Scheduled(fixedRate = 2000)//scheduler to run every two seconds
	public void scheduleTask() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy HH:ss.SSS");
		String strDate=dateFormat.format(new Date() );
		System.out.println("Fixed rate Scheduler:Task running at -" + strDate); 
	}
}
