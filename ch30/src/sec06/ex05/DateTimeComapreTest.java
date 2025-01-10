package sec06.ex05;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeComapreTest {
	public static void main(String[] args) {
		LocalDateTime beginDateTime = LocalDateTime.of(2022, 8, 1, 9, 0, 0);  //2022-08-01T09:00
		System.out.println("지원 시작 일자:" + beginDateTime);

		LocalDateTime endDateTime = LocalDateTime.of(2023, 10, 21, 9, 0, 0);   //2023-10-21T09:00
		System.out.println("지원 종료 일자:" + endDateTime);
		System.out.println();

		if (beginDateTime.isBefore(endDateTime)) {
			System.out.println("지원 가능 기간입니다.");
		} else if (beginDateTime.isEqual(endDateTime)) {
			System.out.println("오늘이 종료일입니다.");
		} else if (beginDateTime.isAfter(endDateTime)) {
			System.out.println("지원이 마감되었습니다.");
		}

		// until() 메서드
		long remainYears1 = beginDateTime.until(endDateTime, ChronoUnit.YEARS);
		System.out.println("남은 년: " + remainYears1);  //1년

		long remainMonths1 = beginDateTime.until(endDateTime, ChronoUnit.MONTHS);
		System.out.println("남은 월: " + remainMonths1);  //14개월

		long remainDays1 = beginDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println("남은 일: " + remainDays1);  //446일
		System.out.println();

		// between() 메서드
		long remainYears2 = ChronoUnit.YEARS.between(beginDateTime, endDateTime);
		System.out.println("남은 년: " + remainYears2);

		long remainMonths2 = ChronoUnit.MONTHS.between(beginDateTime, endDateTime);
		System.out.println("남은 월: " + remainMonths2);

		long remainDays2 = ChronoUnit.DAYS.between(beginDateTime, endDateTime);
		System.out.println("남은 일: " + remainDays2);
		System.out.println();

		// Period의 between() 메서드(각각의 년,월,일의 차이를 구합니다.)
		Period period = Period.between(beginDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println("남은 년: " + period.getYears());   
		System.out.println("남은 월: " + period.getMonths());
		System.out.println("남은 일: " + period.getDays());

	}

}
