package sec01.ex04;

import java.util.Scanner;

public class SwitchScoreTEst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력해주세요.");
		int score = sc.nextInt();
		
		int mok = score / 10;
		
		switch(mok) {
			case 9, 10:  //90~100점 사이의 점수인 경우
				System.out.println("매우 우수합니다.");
				break;
			case 7, 8:  //80~90점 사이의 점수인 경우
				System.out.println("우수합니다.");
				break;
			case 5, 6:
				System.out.println("양호합니다.");
				break;
			default:
				System.out.println("더욱 노력해야합니다.");
				break;
		}
		
		sc.close();
		

	}

}
