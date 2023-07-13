package sec04.ex01;

import java.util.Scanner;

public class ThrowsTest {
	
	public static int inputScore() throws NumberFormatException{
		int score = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		String str = sc.nextLine();
		
		score = Integer.parseInt(str);
		return score;
	}

	public static void main(String[] args) {
		try {
			int score = inputScore();
			System.out.println("입력 점수 : " + score+"점");
		}catch(NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}
		System.out.println("프로그램 종료");

	}

}
