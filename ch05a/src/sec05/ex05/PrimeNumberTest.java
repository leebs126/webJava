package sec05.ex05;

import java.util.Scanner;

public class PrimeNumberTest {

//	①	양의 정수를 1부터 양의 정수 사이의 정수로 차례대로 나눕니다.
//	②	나누어질 때 약수의 개수를 세는 변수의 값을 1 증가시킵니다.
//	③	변수의 값이 2이면 소수이고 아니면 합성수입니다.

	public static void main(String[] args) {
		int num = 0, count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("양의 정수를 입력하세요.");
		System.out.print("num = ");
		num = sc.nextInt();

		// 약수의 개수를 구한다.
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++; // 약수의 개수를 저장한다.
			}
		}

		// 소수 여부를 판별한다.

		if (count == 2) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 합성수입니다.");
		}
		
		sc.close();

	}

}
