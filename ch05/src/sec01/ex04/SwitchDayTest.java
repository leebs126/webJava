package sec01.ex04;

import java.util.Scanner;

public class SwitchDayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 입력해주세요.");
		int day = sc.nextInt();

//		switch(3.0);
		switch (day) {
		case 1:
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
			break;
		case 6:
			System.out.println("토요일입니다.");
			break;
		default:
			System.out.println("일요일입니다.");
			break;
		}
	}

}
