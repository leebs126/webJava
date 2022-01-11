package sec05.ex03;

import java.util.Scanner;

public class DigitSumOfNumberTest {

	public static void main(String[] args) {
		int num = 0, remainder = 0, mok = 0;
		;

		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하세요.");
		System.out.print("num = ");
		num = sc.nextInt();
		mok = num;

		do {
			remainder += mok % 10;
			mok /= 10;
		} while (mok != 0);

		System.out.println(num + "의 자리수의 합은 " + remainder);

	}

}
