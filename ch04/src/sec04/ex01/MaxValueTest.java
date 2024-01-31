package sec04.ex01;

import java.util.Scanner;

public class MaxValueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		String temp1 = sc.nextLine();
		int num1 = Integer.parseInt(temp1);
		String temp2 = sc.nextLine();
		int num2 = Integer.parseInt(temp2);
		
		int result = (num1 > num2) ? num1 : num2;
		
		System.out.println(num1 +"과 " +num2 +" 중 큰 수는 " + result +"입니다.");

	}

}
