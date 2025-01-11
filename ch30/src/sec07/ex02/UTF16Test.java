package sec07.ex02;

import java.io.UnsupportedEncodingException;

public class UTF16Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "aaa".getBytes("UTF-16");      
		byte[] b2 = "°¡³ª´Ù".getBytes("UTF-16");  
		
		System.out.println(b1.length);  //8
		System.out.println(b2.length);  //8
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
		
		System.out.println(new  String(b1, "UTF-16"));
		System.out.println(new  String(b2, "UTF-16"));
	}
}
