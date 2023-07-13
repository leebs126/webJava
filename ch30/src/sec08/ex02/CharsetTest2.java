package sec08.ex02;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetTest2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "사과".getBytes();  //시스템의 기본 문자셋이 적용됨 ,UTF-8
		byte[] b2 = "사과".getBytes(Charset.defaultCharset());   // UTF-8
		byte[] b3 = "사과".getBytes(Charset.forName("MS949")); // 2바이트
		byte[] b4 = "사과".getBytes("UTF-8");  
		
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(b3.length);
		System.out.println(b4.length);
	}
}
