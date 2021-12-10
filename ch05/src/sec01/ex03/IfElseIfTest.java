package sec01.ex03;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 점수를 입력해 주세요.");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("90~100점입니다.");
			System.out.println("A학점입니다.");
		} else if (score >= 80) {
			System.out.println("80~90점입니다.");
			System.out.println("B학점입니다.");
		} else if (score >= 70) {
			System.out.println("70~80점입니다.");
			System.out.println("C학점입니다.");
		} else if(score >= 60){
			System.out.println("60~70점입니다.");
			System.out.println("D학점입니다.");
		}else {
			System.out.println("60점 미만입니다.");
			System.out.println("F학점입니다.");
			
		}
		
		sc.close();

	}

}
