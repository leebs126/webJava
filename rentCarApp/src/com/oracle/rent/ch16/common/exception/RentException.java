package com.oracle.rent.ch16.common.exception;

import java.util.Calendar;

public class RentException extends Exception {
	
	public RentException() {
		
	}
	
	public RentException(String message) {
		super(message);
	}

	public String getRentExceptionInfo() {
		String errMsg = "예외 발생 시간: " + showTime() + " 예외 내용:" + super.getMessage();
		return errMsg;
	}

	//예외 발생 시각 정보를 제공하는 메소드
	public static String showTime() {
		String date = null;
		String time = null;
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		date = year + "-" + month + "-" + day;
		time = hour + ":" + min + ":" + sec;
		return date + " " + time;
	}
}
