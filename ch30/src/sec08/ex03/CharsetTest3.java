package sec08.ex03;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class CharsetTest3 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] b1 = "사과".getBytes("UTF-8");

		String str1 = new String(b1);
		String str2 = new String(b1, Charset.defaultCharset());
		String str3 = new String(b1, Charset.forName("MS949"));
		String str4 = new String(b1, "UTF-8");

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
