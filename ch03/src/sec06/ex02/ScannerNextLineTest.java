package sec06.ex02;

import java.util.Scanner;

public class ScannerNextLineTest {

	public static void main(String[] args) {
		String message;
		Scanner sc = new Scanner(System.in);

		System.out.println("메시지를 입력하세요:");
		// message = sc.next();
		message = sc.nextLine();
		System.out.println(message);
		sc.close();
	}

}
