package sec05.ex04;

import java.util.Scanner;

public class GCDTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int gcd = 1;   //최대 공약수 (great common divisor)
		
		System.out.println("두 자연수를 입력하세요.");
		System.out.print("num1 = ");
		num1 = sc.nextInt();
		
		System.out.print("num2 = ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		
		//1. 1에서 두 자연수 중 작은 자연수 사이의 자연수들로 차례대로 두 자연수를 나눕니다.
		//2. 두 자연수를 동시에 나누면 그 수는 공약수입니다.
		//3. 공약수를 모두 구한 후 그 중 제일 큰 공약수를 구합니다.
		
		for(int i = 1; i<=num1; i++) {
			if(num1 % i ==0 && num2 % i==0) {
				System.out.println("공약수 : " +i);
				if(gcd < i) {
					gcd = i;
				}
			}
		}
		
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 = " + gcd);
		
		sc.close();

	}

}
