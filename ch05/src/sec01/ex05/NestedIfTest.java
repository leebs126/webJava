package sec01.ex05;

import java.util.Scanner;

public class NestedIfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력해주세요.");
		String temp = sc.nextLine();
		int score = Integer.parseInt(temp);

		if ((0<= score) && (score <= 100)) {

			if (score >= 90) {
				System.out.println("90~100점입니다.");
				System.out.println("A학점입니다.");
			} else if (score >= 80) {
				System.out.println("80~90점입니다.");
				System.out.println("B학점입니다.");
			} else if (score >= 70) {
				System.out.println("70~80점입니다.");
				System.out.println("C학점입니다.");
			} else {
				System.out.println("70점 미만입니다.");
				System.out.println("D학점입니다.");
			}
		} else {
			System.out.println("시험점수를 잘못 입력했습니다.");
		}

	}

}
