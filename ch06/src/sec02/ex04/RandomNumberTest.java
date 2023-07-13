package sec02.ex04;

import java.util.Scanner;

public class RandomNumberTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요: ");
		int a = input.nextInt();

		System.out.print("두 번째 정수를 입력하세요: ");
		int b = input.nextInt();

		int randomInt = (int) (Math.random() * (b - a + 1)) + a;

		System.out.println(a + "와(과) " + b + " 사이의 랜덤 정수: " + randomInt);

	}

}
