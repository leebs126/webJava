package sec05.ex01;

import java.util.Objects;

public class NullTest {
	public static void main(String[] args) {
		String str1 = "이순신";
		String str2 = null;

		System.out.println(Objects.isNull(str1));  //false
		System.out.println(Objects.isNull(str2));   //true
		System.out.println();

		System.out.println(Objects.nonNull(str1));  //true
		System.out.println(Objects.nonNull(str2));   //false
		System.out.println();

		try {
			String result1 = Objects.requireNonNull(str1);
			System.out.println(result1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
//			String result2 = Objects.requireNonNull(str2);  //NullPointerException  발생
			String result2 = Objects.requireNonNull(str2,"이름이 없습니다.");  
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
