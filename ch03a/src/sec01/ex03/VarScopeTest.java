package sec01.ex03;

public class VarScopeTest {
	int value2;

	public static void main(String[] args) {
		int num1 = 10; //변수는 선언된 블럭 안에서만 사용 가능하다.
		int value1 = num1 + 20;
		
		System.out.println("num1 = " + num1 + ", value1 = " + value1);
//		System.out.println(value2);
	}
	
//	System.out.println("num1 = " + num1 + ", value1 = " + value1);

}
