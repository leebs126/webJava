package sec06.ex02;

import java.time.LocalDateTime;

public class LocalDateTimeTest {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println();
		
		System.out.println(now.getYear() +"년");
		System.out.println(now.getMonthValue() +"월");
		System.out.println(now.getDayOfMonth() +"일");
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getHour()+"시");
		System.out.println(now.getMinute()+"분");
		System.out.println(now.getSecond()+"초");
		
	}
}
