package com.kh.b_date.dDay;

import java.util.Calendar;
import java.util.Date;

public class Dday {

	public long dDay(int year, int month, int date) {
		long between = 0;
		/*
		long start = 0;
		long end = 0;
		
		
		Calendar calendar = Calendar.getInstance();
		Date today = new Date();
		calendar.setTime(today);
		start = calendar.getTimeInMillis();
		calendar.set(year, month-1, date);
		end = calendar.getTimeInMillis();
		
		between = (end - start)/1000/60/60/24;
		*/
		//현재시간을 세팅할 Calendar
		Calendar now = Calendar.getInstance();
		//사용자가 입력한 시간을 세팅할 Calendar
		Calendar input = Calendar.getInstance();
		
		//사용자가 입력한 시간을 input에 세팅
		input.set(year, month, date);
		
		//두 날짜 사이의 milliSecond 계산
		//getTimeInMillis() -> Epoch로 부터 Calendar에 세팅된 시간까지의 milliseconds
		between = input.getTimeInMillis() - now.getTimeInMillis();
		between /= 1000;	//초
		between /= 60;		//분
		between /= 60;		//시간
		between /= 24;		//일
		
		return between;
		
	}
}
