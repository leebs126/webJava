package sec04.ex01;

import java.util.Scanner;

public class DigitSumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 자리의 정수를 입력하세요.");
		
		int num1 = sc.nextInt();
		int total = num1 / 100;
		
		num1 %= 100;
		total += num1 / 10;
		num1 %= 10;
		total += num1;
		
		System.out.println("자리수의 합은 " + total +"입니다.");
	}

}
