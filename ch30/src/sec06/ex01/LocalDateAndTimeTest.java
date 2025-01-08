package sec06.ex01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateAndTimeTest {
	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now(); //현재 로컬 날짜 
		System.out.println(currDate);
		
		LocalDate targetDate = LocalDate.of(2024, 7, 22);
		System.out.println(targetDate);     
		System.out.println(); 
		
		//LocalTime 클래스
		LocalTime currTime = LocalTime.now();   //현재 로컬의 시각
		System.out.println(currTime);
		System.out.println();
		
		LocalDateTime currDateTime = LocalDateTime.now(); //현재 로컬 날짜와 시각 정보  
		System.out.println(currDateTime);
		System.out.println();
		
//		System.currentTimeMillis();
//		System.nanoTime();
		
		Instant instant1 = Instant.now();   //타임스탬프 
		for(int i = 0 ; i< 10000000;i++) {}
		Instant instant2 = Instant.now();
		
		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println("for문 수행 시간: " + instant1.until(instant2, ChronoUnit.NANOS) +" nanos");
	}

}
