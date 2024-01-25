package sec06.ex01;

import java.util.Scanner;

public class RealNumScannerTest {

	public static void main(String[] args) {
		float num1 = 0.0f;
		double num2 = 0.0d;
		String temp = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 실수를 입력하세요.");
		temp = sc.nextLine();
		num1 = Float.parseFloat(temp);
		temp = sc.nextLine();
		num2 = Double.parseDouble(temp);
		System.out.println("첫 번째 실수: " + num1);
		System.out.println("두 번째 실수: " + num2);
		sc.close();

	}

}
