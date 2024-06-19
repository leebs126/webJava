package sec05.ex01;

import java.io.IOException;

public class ThrowTest {
	public static void call() throws ArrayIndexOutOfBoundsException {
		System.out.println("call() 메소드 시작");
		
		int[] num = new int[2];
		num[0] = 1;
		num[1] = 2;
//		num[2] = 3;  //ArrayIndexOutOfBoundsException 예외 발생
		
		if (num.length == 2) {
			throw new ArrayIndexOutOfBoundsException("배열크기가 2");
		}
		System.out.println("call() 메소드 종료");

	}

	public static void main(String[] args) {
		try {
			call();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			String message = e.getMessage();
			System.out.println(message);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

}
