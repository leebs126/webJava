package sec01.ex04;

import java.util.Scanner;

public class SwitchDayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요일을 입력해주세요.");
		String day = sc.nextLine();

		switch (day) {
		case "월요일":
			System.out.println("월요일입니다.");

			break;
		case "화요일":
			System.out.println("화요일입니다.");
			break;
		case "수요일":
			System.out.println("수요일입니다.");
			break;
		case "목요일":
			System.out.println("목요일입니다.");
			break;
		case "금요일":
			System.out.println("금요일입니다.");
			break;
		case "토요일":
			System.out.println("토요일입니다.");
			break;
		default:
			System.out.println("일요일입니다.");
			break;
		}
	}

}
