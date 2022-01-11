package sec05.ex05;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int num = 0, count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요.");
		System.out.print("num = ");
		num = sc.nextInt();

		// 약수의 개수를 구합니다.
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		// 소수 여부를 판별합니다.
		if (count == 2) {
			System.out.println(num + "은 소수입니다.");
		} else {
			System.out.println(num + "은 합성수입니다.");
		}

	}

}
