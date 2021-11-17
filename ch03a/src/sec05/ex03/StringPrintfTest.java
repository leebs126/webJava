package sec05.ex03;

public class StringPrintfTest {

	public static void main(String[] args) {
		String str = "Hello, World!";
		String name ="홍길동";
		char grade = 'A';
		
		System.out.printf("%s\n", str);
//		System.out.printf("%f\n", str);  //서식 지정자를 잘못 지정할 경우 실행 중 에러가 발생한다.
		System.out.printf("%20s\n", str);
		System.out.printf("%-20s\n", str);
		System.out.printf("학생 이름은 %s입니다.\n", name);
		System.out.printf("학점은 \'%c\'입니다.", grade);
		
		
		
		
				
				

	}

}
