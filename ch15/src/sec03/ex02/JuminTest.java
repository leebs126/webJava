package sec03.ex02;

public class JuminTest {

	public static void main(String[] args) {
		String jumin = "111111-1222222";

		int idx = jumin.indexOf("-");
		String front = jumin.substring(0, idx);

		String temp = (jumin.substring(idx + 1, jumin.length()));
		String end = "";

		for (int i = 0; i < temp.length(); i++) {
			if (i == 0) {
				end += temp.charAt(i);
			} else {
				end += "*";
			}
		}

		System.out.println("주민번호 : " + front + "-" + end);
	}

}
