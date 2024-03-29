package sec02.ex01;

import java.util.Scanner;

public class MethodTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력해 주세요 : ");
		String temp = sc.nextLine();
		int num = Integer.parseInt(temp);
		
		MethodTest3 m = new MethodTest3();
		int result = m.digitSum(num);
		System.out.println(num + "의 자리수의 합 : " + result);
		
		System.out.println("종료");

	}

	public int digitSum(int val) {
		// 1. 지역변수 선언
		int total = 0;

		// 2. 기능 구현
		while (true) {
			total += val % 10;
			val /= 10;
			if (val == 0)
				break;
		}

		//3.결과값 출력또는 반환
		return total;
	}

}
