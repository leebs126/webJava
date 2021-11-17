package sec05.ex02;

public class IntPrintFTest {

	public static void main(String[] args) {
		int num1 = 543;
		System.out.printf("%d\n", num1);
		System.out.printf("num1의 값은 %d입니다.\n", num1);
		System.out.printf("%10d\n", num1);
		System.out.printf("%-10d\n", num1);
		System.out.printf("%010d\n", num1);
		
		System.out.printf("%o\n", num1);
		System.out.printf("%x\n", num1);
		System.out.printf("%X\n", num1);
		System.out.printf("%%d = %d\n", num1); //에스케이프 문자
		
	}

}
