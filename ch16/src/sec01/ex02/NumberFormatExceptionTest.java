package sec01.ex02;

import java.util.Scanner;

public class NumberFormatExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		String str = sc.nextLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("입력한 정수 : " + num);
		
		sc.close();
		

	}

}
