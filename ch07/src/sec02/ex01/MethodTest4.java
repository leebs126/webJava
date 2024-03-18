package sec02.ex01;

import java.util.Scanner;

public class MethodTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입력해주세요.");
		String temp = sc.nextLine();
		int num = Integer.parseInt(temp);

		MethodTest4 m = new MethodTest4();
		m.findPrime(num);

		System.out.println("종료");

	}

	public void findPrime(int val) {
		// 1. 지역 변수 선언
		int count = 0; // 약수의 갯수를 저장하는 변수

		for (int i = 1; i <= val; i++) {
			if (val % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(val + "은 소수입니다.");
		} else {
			System.out.println(val + "은 합성수입니다.");
		}

	}

}
