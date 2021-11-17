package sec06.ex01;
import java.util.Scanner;  

public class NextIntTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		
		System.out.println("정수를 입력하세요.");
		num1 = sc.nextInt();
		
		System.out.println("입력한 정수는 " + num1 + " 입니다.");
		sc.close();

	}

}
