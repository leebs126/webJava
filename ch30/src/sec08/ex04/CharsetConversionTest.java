package sec08.ex04;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetConversionTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String originalStr = "안녕";   // UTF-8
		System.out.println("원본 문자열: " + originalStr);
		System.out.println();
		
		byte[] euckrStringBuffer = originalStr.getBytes(Charset.forName("EUC-KR")); // String 을 EUC-KR 바이트 데이터로 변환 
		System.out.println("EUC-KR 문자열 길이: " + euckrStringBuffer.length);
		String decodedFromEucKr = new String(euckrStringBuffer, "EUC-KR");   // 바이트 데이터를 EUC-KR 문자열로 변환
		System.out.println("EUC-KR로 변환된 문자열 : " + decodedFromEucKr);   

		byte[] utf8StringBuffer = decodedFromEucKr.getBytes("UTF-8");  // String 을 UTF-8 바이트 데이터로 변환
		System.out.println();
		
		System.out.println("UTF-8 문자열 길이: " + utf8StringBuffer.length); 
		String decodedFromUtf8 = new String(utf8StringBuffer, "UTF-8");  // 바이트 데이터를 UTF-8 문자열로 변환
		System.out.println("UTF-8로 변환된 문자열: " + decodedFromUtf8);
	}

}
