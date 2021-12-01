package sec02.ex01;

import java.util.Scanner;

public class ConditionalOpTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시험 점수를 입력해 주세요.");
		
		int score = sc.nextInt();
			
		String result = (0 <= score && score <= 100) ? "바르게 입력했습니다." : "다시 입력해 주세요.";
		System.out.println(result);
		
		
		if(0 <= score && score <= 100) {
			result = "바르게 입력했습니다.";
		}else {
			result = "다시 입력해 주세요.";
		}
	}

}
