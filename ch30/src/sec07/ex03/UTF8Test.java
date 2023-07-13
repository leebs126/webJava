package sec07.ex03;

import java.io.UnsupportedEncodingException;

public class UTF8Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "aaa".getBytes("UTF-8");
		byte[] b2 = "가나다".getBytes("UTF-8");
		
		System.out.println(b1.length);  //3바이드
		System.out.println(b2.length); //9바이트
		System.out.println();
		
		for(byte b : b1) {
			System.out.printf("%02X ", b);
		}
		System.out.println();
		
		for(byte b : b2) {
			System.out.printf("%02X ", b);
		}
		System.out.println();
		System.out.println();
		
		System.out.println(new  String(b1, "UTF-8"));
		System.out.println(new  String(b2, "UTF-8"));

	}

}
