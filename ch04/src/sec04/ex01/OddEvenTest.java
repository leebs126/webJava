package sec04.ex01;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		
		String result = ((num1 % 2) == 0) ? "짝수" : "홀수";
		
		System.out.println(num1 + "는 " + result + "입니다.");
		
		
		
	}

}
