package sec06.ex02;

import java.util.Scanner;

public class ScannerNextValuesTest {

	public static void main(String[] args) {
		String name;
		int math;
		Scanner sc = new Scanner(System.in);

		System.out.println("이름과 수학 점수를 입력하세요:");
		name = sc.next();
		math = sc.nextInt();
		System.out.println("이름은 " + name + " , 수학점수는 " + math + "점입니다.");
		sc.close();
	}

}
