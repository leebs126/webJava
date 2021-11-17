package sec06.ex02;

import java.util.Scanner;

public class NextLineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		
		System.out.println("메시지를 입력하세요.");
//		message = sc.next();
		message = sc.nextLine(); //한줄 단위로 문자열을 입력받는다.
		
		System.out.println(message);
		sc.close();
		

	}

}
