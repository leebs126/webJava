package sec08.ex04;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetConversionTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String originalStr = "안녕";
		System.out.println("원본 문자열: " + originalStr);
		
		byte[] euckrStringBuffer = originalStr.getBytes(Charset.forName("EUC-KR")); // String 을 EUC-KR 로 인코딩
		System.out.println();

		System.out.println("EUC-KR 문자열 길이: " + euckrStringBuffer.length);
		String decodedFromEucKr = new String(euckrStringBuffer, "EUC-KR");
		System.out.println("EUC-KR로 변환된 문자열 : " + decodedFromEucKr);// String 을 UTF-8 로 인코딩.

		byte[] utf8StringBuffer = decodedFromEucKr.getBytes("UTF-8");
		System.out.println();
		System.out.println("UTF-8 문자열 길이: " + utf8StringBuffer.length);
		String decodedFromUtf8 = new String(utf8StringBuffer, "UTF-8");
		System.out.println("UTF-8로 변환된 문자열: " + decodedFromUtf8);
	}

}
