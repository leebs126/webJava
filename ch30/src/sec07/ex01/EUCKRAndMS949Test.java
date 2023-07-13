package sec07.ex01;

import java.io.UnsupportedEncodingException;

public class EUCKRAndMS949Test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "a".getBytes("EUC-KR");
		byte[] b2 = "a".getBytes("MS949");
		System.out.println(b1.length);
		System.out.println(b2.length);
		
		//  byte 데이터 --> 문자열
		System.out.println(new String(b1, "EUC-KR"));  
		System.out.println(new String(b2, "MS949"));
		System.out.println();
		
		byte[] b3 = "가".getBytes("EUC-KR");
		byte[] b4 = "가".getBytes("MS949");
		System.out.println(b3.length);
		System.out.println(b4.length);
		
		//  byte 데이터 --> 문자열
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));
		
		
		byte[] b5 = "꽰".getBytes("EUC-KR");  //EUC-KR에서 지원하지 않으므로 1바이트가 할당됩니다.
		byte[] b6 = "꽰".getBytes("MS949");
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR")); //EUC-KR에서 지원하지 않으므로 글자가 깨집니다.
		System.out.println(new String(b6, "MS949"));   //"꽰"  
		
		byte[] b7 = "가".getBytes("EUC-KR");
		for(byte b : b7) {
			System.out.printf("%02X", b);  //B0A1
		}

	}

}
