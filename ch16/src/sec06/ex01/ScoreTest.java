package sec06.ex01;

import java.util.Scanner;

public class ScoreTest {
	public static int calcScore(int score) throws UserDefinedException {
		if (score <= 0 || 100 <= score) {
			throw new UserDefinedException("정확한 점수를 입력하세요.");
		}

		return score;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력하세요");

		int score = sc.nextInt();

		try {
			score = calcScore(score);
			System.out.println("입력한 시험점수는 " + score + "입니다.");

		} catch (UserDefinedException e) {
			System.out.println(e.getUserExceptionInfo());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	}

}
