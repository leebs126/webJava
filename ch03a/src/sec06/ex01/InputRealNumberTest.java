package sec06.ex01;
import java.util.Scanner;

public class InputRealNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1 = 0.0f;
		double num2 = 0.0d;
		String temp = null;
		
		System.out.println("두 개의 실수를 입력하세요.");
		temp = sc.nextLine();
		num1 = Float.parseFloat(temp);
		
		temp = sc.nextLine();
		num2 = Double.parseDouble(temp);
		
		System.out.println("첫번째 실수: " + num1);
		System.out.println("두번째 실수: " + num2);
		sc.close();

	}

}
