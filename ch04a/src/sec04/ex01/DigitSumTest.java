package sec04.ex01;

import java.util.Scanner;

public class DigitSumTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 자리수 정수를 입력하세요.");
		
		int num1 = sc.nextInt();
		int total = num1 / 100;  //100으로 나누어서 세번째 자리수의 수를 total에 저장합니다.
		
		num1 %= 100; 
		total += num1 / 10;  //두 번째 자리의수를 total에 누적합니다.
		num1 %= 10;
		total += num1;    //세 번째 자리의 수를 total에 누적합니다.

		System.out.println("자리수의 합은 " + total +"입니다.");
		

	}

}
