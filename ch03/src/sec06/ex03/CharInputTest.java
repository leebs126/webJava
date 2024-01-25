package sec06.ex03;

import java.util.Scanner;

public class CharInputTest {

	public static void main(String[] args) {
		char grade; 
		Scanner sc = new Scanner(System.in);
	
		System.out.println("학점을 입력하세요:");
		String temp = sc.nextLine();
		grade = temp.toUpperCase().charAt(0);
		
		System.out.println("학점은 " + grade);
		sc.close();
	}
}
