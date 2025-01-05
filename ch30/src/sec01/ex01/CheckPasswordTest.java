package sec01.ex01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPasswordTest {
	
	private static String checkPassword(String id, String pwd) {
		// 비밀번호 지정 규칙 확인(영문, 특수문자, 숫자 포함 8자 이상)
		Pattern passPattern1 = Pattern.compile("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$");
		Matcher passMatcher1 = passPattern1.matcher(pwd);

		if (!passMatcher1.find()) {
			return "비밀번호는 영문과 특수문자 숫자를 포함하며 8자 이상이어야 합니다.";
		}

		// 반복된 문자 확인
		Pattern passPattern2 = Pattern.compile("(\\w)\\1\\1\\1");   //[a-zA-Z_0-9]와 동일
		Matcher passMatcher2 = passPattern2.matcher(pwd);

		if (passMatcher2.find()) {
			return "비밀번호에 동일한 문자를 과도하게 연속해서 사용할 수 없습니다.";
		}

		// 아이디 포함 확인
		if (pwd.contains(id)) {
			return "비밀번호에 ID를 포함할 수 없습니다.";
		}

		// 특수문자 확인
		Pattern passPattern3 = Pattern.compile("\\W");   //[^a-zA-Z_0-9]와 동일
		Pattern passPattern4 = Pattern.compile("[!@#$%^*+=-]");

		for (int i = 0; i < pwd.length(); i++) {
			String s = String.valueOf(pwd.charAt(i));
			Matcher passMatcher3 = passPattern3.matcher(s);

			if (passMatcher3.find()) {
				Matcher passMatcher4 = passPattern4.matcher(s);
				if (!passMatcher4.find()) {
					return "비밀번호에 특수문자는 !@#$^*+=-만 사용 가능합니다.";
				}
			}
		}

		// 연속된 문자 확인
		int ascSeqCharCnt = 0; // 오름차순 연속 문자 카운트
		int descSeqCharCnt = 0; // 내림차순 연속 문자 카운트

		char char0;
		char char1;
		char char2;

		int diff01;
		int diff12;

		for (int i = 0; i < pwd.length() - 2; i++) {
			char0 = pwd.charAt(i);
			char1 = pwd.charAt(i + 1);
			char2 = pwd.charAt(i + 2);

			diff01 = char0 - char1;
			diff12 = char1 - char2;

			if (diff01 == 1 && diff12 == 1) {
				ascSeqCharCnt += 1;
			}

			if (diff01 == -1 && diff12 == -1) {
				descSeqCharCnt += 1;
			}
		}

		if (ascSeqCharCnt > 1 || descSeqCharCnt > 1) {
			return "비밀번호에 연속된 문자열을 사용할 수 없습니다.";
		}

		return "유효한 비밀번호입니다.";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요");
		String password = sc.nextLine();
		
		String result = checkPassword(id, password);
		System.out.println(result);

	}

}
