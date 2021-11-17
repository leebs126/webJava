package sec06.ex03;

import java.util.Scanner;

public class CharInputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;

		System.out.println("학점을 입력하세요:");
//		grade = sc.next().charAt(0);

		String temp = sc.next();
		grade = temp.toUpperCase().charAt(0);

		System.out.println("학점은 " + grade);

	}

}
