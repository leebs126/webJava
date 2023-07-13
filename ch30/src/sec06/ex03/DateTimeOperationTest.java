package sec06.ex03;

import java.time.LocalDateTime;

public class DateTimeOperationTest {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime now2 = now.plusYears(3); //3년 증가
		System.out.println(now2);
		
		LocalDateTime now3 = now.minusMonths(3);  //3개월 감소
		System.out.println(now3);
		
		LocalDateTime now4 = now.plusDays(10); //10일 증가
		System.out.println(now4);
		
	}

}
