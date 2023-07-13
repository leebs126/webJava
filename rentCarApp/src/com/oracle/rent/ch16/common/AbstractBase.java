package com.oracle.rent.ch16.common;

import java.util.Calendar;
import java.util.List;

import com.oracle.rent.ch17.member.MemberVO;

public abstract class AbstractBase {
	// 하위 클래스의 결과값을 출력하는 메소드
	public void displayData(String data) {
		System.out.println("조회한 데이터는 " + data + " 입니다."  + "\n");
	}

	// 조회한 데이터의 시간 정보를 제공하는 메소드
	public String showTime() {
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
