package com.creating.www.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest001 {
    
	public CalendarTest001() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cd=Calendar.getInstance();
		Date date001=cd.getTime();
		cd.set(Calendar.AM,10);
		Date date002=cd.getTime();
	System.out.println(sdf.format(date001));
	System.out.println(sdf.format(date002));
	}

}
