package sec06.ex02;

import java.util.Scanner;

public class ScannerNextLineValuesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, addr;

		System.out.println("이름과 주소를 입력하세요:");
		name = sc.nextLine();
		addr = sc.nextLine();
		System.out.println("이름은 " + name + " , 주소는 " + addr);
		sc.close();
	}

}
