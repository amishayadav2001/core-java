package com.aurionpro.test;

import com.aurionpro.model.Time;

public class TimeTest {
	public static void main(String[] args) {
		Time time1 = new Time(16, 32, 47);
		Time time2 = new Time(10, 16, 40);

		Time sumTime = addTimeObjects(time1, time2);
		System.out.println(sumTime);
	}

	private static Time addTimeObjects(Time time1, Time time2) {
		Time tempTime = new Time();
		
		tempTime.setSecond(time1.getSecond()+time2.getSecond());
		tempTime.setMinute(time1.getMinute()+time2.getMinute());
		tempTime.setHour(time1.getHour()+time2.getHour());
		correctTime(tempTime);
		return tempTime;
	}

	private static void correctTime(Time tempTime) {
		correctSeconds(tempTime);
		correctMinutes(tempTime);
		correctHours(tempTime);
	}

	private static void correctHours(Time tempTime) {
		if(tempTime.getHour()>23) {
			tempTime.setHour(tempTime.getHour()%24);
		}
	}

	private static void correctMinutes(Time tempTime) {
		while(tempTime.getMinute()>60) {
			tempTime.setMinute(tempTime.getMinute()-60);
			tempTime.setHour(tempTime.getHour()+1);
		}
	}

	private static void correctSeconds(Time tempTime) {
		while(tempTime.getSecond()>60) {
			tempTime.setSecond(tempTime.getSecond()-60);
			tempTime.setMinute(tempTime.getMinute()+1);
		}
		
	}
}
