package sec06.ex04;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println();
		
		//년 정보 
		LocalDateTime testDateTime = null;
		testDateTime = now.with(TemporalAdjusters.firstDayOfYear());  //금년의 첫번째 날 
		System.out.println(testDateTime);
		
		testDateTime = now.with(TemporalAdjusters.lastDayOfYear());  //금년의 마지막 날
		System.out.println(testDateTime);
		
		testDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());  //내년의 마지막 날
		System.out.println(testDateTime);
		System.out.println();
		
		//월 정보 
		testDateTime = now.with(TemporalAdjusters.firstDayOfMonth());  //이번달의 첫번째 날
		System.out.println(testDateTime);
		
		testDateTime = now.with(TemporalAdjusters.lastDayOfMonth());  //이번달의 마지막 날
		System.out.println(testDateTime);
		
		testDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());  //다음 달의 첫번째 날 
		System.out.println(testDateTime);
	}

}
