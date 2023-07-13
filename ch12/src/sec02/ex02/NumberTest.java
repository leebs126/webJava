package sec02.ex02;

public class NumberTest {

	public static void main(String[] args) {
		System.out.println("numCount의 값: " + Number.numCounter);
		
		Number number1 = new Number();
		number1.incNum();
		System.out.println("numCount의 값: " + Number.getNumCounter());
		
		Number number2 = new Number();
		number2.incNum();
		number2.incNum();
		
		System.out.println("numCount의 값: " + Number.getNumCounter());
		System.out.println("numCount의 값: " + number1.getNumCounter());
		System.out.println("numCount의 값: " + number2.getNumCounter());

	}

}
