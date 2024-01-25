package sec06.ex01;

import java.util.Scanner;

public class MultiIntScanner {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		String temp = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("두 수를 입력하세요");
		temp = sc.nextLine();
		num1 = Integer.parseInt(temp);
		
		temp = sc.nextLine();
		num2 = Integer.parseInt(temp);

		System.out.println("입력한 두 수는 " + num1 + "," + num2 + "입니다.");
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");
		sc.close();

	}

}
