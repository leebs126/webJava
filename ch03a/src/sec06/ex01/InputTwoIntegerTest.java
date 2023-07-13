package sec06.ex01;

import java.util.Scanner;

public class InputTwoIntegerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String temp = null;
		
		System.out.println("두 정수를 입력하세요.");
		
		temp = sc.nextLine();
		num1 = Integer.parseInt(temp);
		
		temp = sc.nextLine();
		num2 = Integer.parseInt(temp);
		
		System.out.println("입력한 두 정수: " + num1 +", " +  num2);
		System.out.println("정수 합: " + (num1 + num2) );
		sc.close();

	}

}
