package sec06.ex01;

import java.util.Scanner;

public class NextIntValuesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		System.out.println("두 정수를 입력하세요.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("입력한 두 정수는 " + num1 +"," +  num2 +  "입니다.");
		System.out.println("두 정수의 합은 " + (num1 + num2) + "입니다.");
		
		
				

	}

}
