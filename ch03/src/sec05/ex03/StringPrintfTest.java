package sec05.ex03;

public class StringPrintfTest {

	public static void main(String[] args) {
		String str = "Hello, World!";
		String name = "홍길동";
		char grade = 'A';
		System.out.printf("%s\n", str);
//		System.out.printf("%f\n", str);
		System.out.printf("%20s\n", str);  //우측 정렬
		System.out.printf("%-20s\n", str);  //좌측 정렬
		System.out.printf("학생이름은 %s입니다.\n", name);
		System.out.printf("학점은 %c입니다.\n", grade);

	}

}
