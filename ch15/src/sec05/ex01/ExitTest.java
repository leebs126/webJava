package sec05.ex01;

import java.util.Scanner;

public class ExitTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요");
		String temp = sc.nextLine();
		int score = Integer.parseInt(temp);
		
		if(0 <= score && score <= 100) {
			System.out.println("점수 : " + score + "점");
			System.exit(0);
		}else {
			System.err.println("점수를 잘못 입력했습니다.");
			System.exit(-1);
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
