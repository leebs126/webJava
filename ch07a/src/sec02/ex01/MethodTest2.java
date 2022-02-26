package sec02.ex01;

import java.util.Scanner;

public class MethodTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요.");
		System.out.print("시작 정수 : ");
		int start = sc.nextInt();
		System.out.print("마지막 정수 : ");
		int end = sc.nextInt();
		
		MethodTest2 m = new MethodTest2();
		m.sum(start, end);
		
		System.out.println("종료");
		

	}

	public void sum(int start, int end) {
		// 1. 지역 변수 선언
		int total = 0;

		// 2. 기능 구현
		for (int i = start; i <= end; i++) {
			total += i;
		}

		// 3. 결과 출력또는 반환
		System.out.println("----------결과 출력----------");
		System.out.println(start + "와 " + end + " 사이의 정수들의 합 : " + total);
	}

}
