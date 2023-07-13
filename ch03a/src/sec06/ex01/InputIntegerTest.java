package sec06.ex01;
import java.util.Scanner;  

public class InputIntegerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		
		System.out.println("정수를 입력하세요.");
		String temp = sc.nextLine();
		num1 = Integer.parseInt(temp); //입력받은 문자열을 정수로 변환합니다.
		
		System.out.println("입력한 정수는 " + num1 + " 입니다.");
		sc.close();

	}

}
