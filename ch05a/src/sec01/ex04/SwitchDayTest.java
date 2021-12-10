package sec01.ex04;

import java.util.Scanner;

public class SwitchDayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 입력해주세요.");
		int day = sc.nextInt();
		
		//switch문과 if-else if문과 변환이 되는 경우
		//1. 조건식에서 동등 비교 연산자(==)가 사용되는 경우
		//2. 조건식에서 사용되는 데이터가 정수이거나 문자열인 경우
		
//		switch(3.0) {
		switch(day) {
			case 1:   //case문 의 값 다음에서는 콜론(:)을 입력합니다.
				System.out.println("월요일입니다.");
				break;
			case 2:
				System.out.println("화요일입니다.");
				break;
			case 3:
				System.out.println("수요일입니다.");
				break;
				
			case 4:
				System.out.println("목요일입니다.");
				break;
				
			case 5:
				System.out.println("금요일입니다.");
//				break;
			
			case 6:
				System.out.println("토요일입니다.");
				break;
			default:
				System.out.println("일요일입니다.");
				break;
		}
		
		sc.close();
	}

}
