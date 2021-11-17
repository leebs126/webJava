package sec05.ex02;

public class IntPrintfTest {

	public static void main(String[] args) {
		int num1 = 543;
		System.out.printf("%d\n", num1); // 변수 num1의 값을 %d위치에 10진수로 출력한다.
		System.out.printf("num1의 값은 %d입니다.\n", num1);
		System.out.printf("%10d\n", num1);
		System.out.printf("%-10d\n", num1);
		System.out.printf("%010d\n", num1);
		System.out.println();
		System.out.printf("%o\n", num1);
		System.out.printf("%x\n", num1);
		System.out.printf("%X\n", num1);
		System.out.printf("%%d =%d 출력", 500);

	}

}
