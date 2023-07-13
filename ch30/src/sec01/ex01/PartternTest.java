package sec01.ex01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PartternTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; // 이메일 주소 정규식
		
		System.out.println("이메일 주소를 입력하세요");
		String email = sc.nextLine();
		
		boolean result = Pattern.matches(regExp, email);
		System.out.println("입력한 이메일:" + email+", " + result); 
	}

}
