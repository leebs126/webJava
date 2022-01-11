package sec05.ex04;

import java.util.Scanner;

public class GCDTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int gcd = 1; // 최대 공약수(great common divisor)

		System.out.println("두 자연수를 입력해 주세요.");
		System.out.print("num1=");
		num1 = sc.nextInt();

		System.out.print("num2=");
		num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i + "는 " + num1 + "과 " + num2 + "의 공약수입니다.");
				
				if (gcd < i) {  //앞에서 구한 공약수보다 i가 크면 최대 공약수를 변경합니다.
					gcd = i;
				}
			}

		}

		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 = " + gcd);

	}

}
