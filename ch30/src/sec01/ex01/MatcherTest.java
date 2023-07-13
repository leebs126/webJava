package sec01.ex01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {
	public static void main(String[] args) {
		String html1 = "<html>아이디: <b>${id} </b></html>";
		String html2 = "<html>아이디: <b>${id} </b>  <b> ${    id  } </b> </html>";
		String html3 = "<html>아이디: <b>#{id} </b></html>";

		String regEx = "[$][{]\\s*+(id)\\s*+[}]";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher1 = pattern.matcher(html1);
		boolean isFound1 = matcher1.find();
		if(isFound1 == true){
			String resultHtml1 = html1.replaceAll(regEx, "hong");
			System.out.println(resultHtml1);
		}
		System.out.println();
		

		Matcher matcher2 = pattern.matcher(html2);
		boolean isFound2 = matcher2.find();
		if(isFound2 == true){
			String resultHtml2 = html2.replaceAll(regEx, "hong");
			System.out.println(resultHtml2);
		}
		System.out.println();
		
		
		Matcher matcher3 = pattern.matcher(html3);
		boolean isFound3 = matcher3.find();  //문자열에 "${id}" 이 없으므로 false를 리턴합니다.
		if(isFound3 == true){
			String resultHtml3 = html3.replaceAll(regEx, "hong");
			System.out.println(resultHtml3);
		}
	}
}
