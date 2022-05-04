package sec07.ex01;

import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		PrimeUtil p = new PrimeUtil();
		int total = p.calcPrime(num);
		System.out.println("1에서 " + num +"사이의 소수들의 합 : " + total);
		
		System.out.println("두 정수를 입력해 주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		total = p.calcPrime(num1, num2);
		System.out.println(num1 + "에서 " + num2 +"사이의 소수들의 합 : " + total);

	}

}
