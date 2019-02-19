package com.creating.www.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.junit.Test;

public class TimerTest {

	public TimerTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void test001() {
		Timer t = new Timer();
		TimerTask tTask = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Hello World!!");

			}
		};
		Date date = new Date();
		long period = 1000L;
		// t.schedule(tTask,date );
		System.out.println(date);
		date.setMinutes((date.getMinutes() + 1));
		System.out.println(date);
		t.schedule(tTask, date, period);

	}
}
