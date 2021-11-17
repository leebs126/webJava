package sec06.ex02;

import java.util.Scanner;

public class ScannerNextTest {

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요:");
		name = sc.next();
		System.out.println("이름은 " + name);

	}

}
