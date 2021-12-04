package sec04.ex01;

import java.util.Scanner;

public class MaxValueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int result = (num1 >= num2) ? num1 : num2;
		System.out.println(num1 + "과 " + num2 + " 중 큰 수는 " + result + "입니다.");
	}

}
