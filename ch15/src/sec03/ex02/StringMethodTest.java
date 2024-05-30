package sec03.ex02;

public class StringMethodTest {

	public static void main(String[] args) {
		String str = "Hello World";

		// 문자열의 길이를 리턴합니다.
		System.out.println(str.length());
		System.out.println("hello world".length());

		// 문자열에서 5번째 위치의 문자를 리턴합니다.
		System.out.println(str.charAt(4));
//		System.out.println(str.charAt(11));
		

		// 문자열에서 문자 'o'의 위치를 리턴합니다.
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("World"));

		// 문자열에서 찾는 문자가 없으면 -1을 리턴합니다.
		System.out.println(str.indexOf("a"));
		System.out.println();

		// 문자열과 문자열을 결합합니다.
		System.out.println(str.concat(" and Java!!"));
		System.out.println(str + " and Java!");

		// 문자열을 소문자로 변환합니다.
		System.out.println(str.toLowerCase());
		System.out.println("Hello World".toLowerCase());
		System.out.println();

		// 문자열을 대문자로 변환합니다.
		System.out.println(str.toUpperCase());

		// 문자열에서 문자 "World"를 "Java"로 대체합니다.
		System.out.println(str.replace("World", "Java"));

		// 문자열에서 3번째 문자부터 7번째 문자까지의 문자열을 출력합니다.
		System.out.println(str.substring(2, 7));

		// 문자열이 "World"로 끝나는지 판별합니다.
		System.out.println(str.endsWith("World"));
		
		//문자열 양단의 공백을 제거합니다.
		System.out.println("  Hello World ".trim());

		// 문자열은 변경 불가성이므로 str이 가리키는 문자열은 변하지 않습니다.
		System.out.println(str);

	}

}
