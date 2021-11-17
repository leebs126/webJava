package sec05.ex03;

public class PrintfValuesTest {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20, num3 = 30;
		double height = 178.93;
		String name = "홍길동";
		char grade = 'A';
		
		System.out.printf("%d %d %d\n", 100, 200, 300);
//		System.out.printf("%d %d %d\n", 100, 200);  //서식 지정자의 갯수가 많은 경우는 실행 시 에러가 발생한다.
//		System.out.printf("%d %d\n", 100, 200, 300);
		
		System.out.printf("%d %d %d\n", num1, num2, num3);
		System.out.printf("%d %o %x\n", num1, num2, num3);
		
		System.out.printf("%d, %.4f, %s\n", 100, 3.141597, " Hello, World!");
//		System.out.printf("%d, %.4f, %f\n ", 100, 3.141597, " Hello, World!");
		
		System.out.printf("이름: %s, 키: %.4f, 학점: %c\n", name, height, grade);
		System.out.printf("이름: %s\t 키: %.4f\t 학점: %c\n", name, height, grade);
		
		System.out.printf("학생의 이름은 %s이고, 학점은 %c입니다.\n", name, grade);
		

	}

}
