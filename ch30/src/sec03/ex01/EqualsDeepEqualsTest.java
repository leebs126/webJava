package sec03.ex01;

import java.util.Arrays;
import java.util.Objects;

public class EqualsDeepEqualsTest {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "HELLO";
		
		System.out.println(Objects.equals(str1, str2)); //true
		System.out.println(Objects.equals(str1, str3));  //false
		System.out.println(Objects.equals(str1, null));  //false
		System.out.println(Objects.deepEquals(str1, str2));  //true
		System.out.println();
		
		Integer[] intArr1 = {100, 200};
		Integer[] intArr2 = {100, 200};
		System.out.println(Objects.equals(intArr1, intArr2));  //false
		System.out.println(Objects.deepEquals(intArr1, intArr2));  //true
		System.out.println(Arrays.deepEquals(intArr1, intArr2));  //true
		System.out.println(Objects.deepEquals(intArr1, null));     //false
		

	}

}
