package sec07.ex03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		
		System.out.println("현재 날짜 : " + year + "년" + month + "월" + day + "일");
		System.out.println("현재 시간 : " + hour + "시 " + min + "분" + sec + "초");
		System.out.println();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String today = null;
		switch(week) {
		case Calendar.SUNDAY:
			today ="일요일"; 
			break;
		case Calendar.MONDAY:
			today ="월요일";
			break;
		case Calendar.TUESDAY:
			today ="화요일";
			break;
		case Calendar.WEDNESDAY:
			today ="수요일";
			break;
		case Calendar.THURSDAY:
			today = "목요일";
			break;
		case Calendar.FRIDAY:
			today = "금요일";
			break;
		case Calendar.SATURDAY:
			today = "토요일";
			break;
		}
		
		System.out.println("오늘의 요일 : " + today);
		

	}

}
