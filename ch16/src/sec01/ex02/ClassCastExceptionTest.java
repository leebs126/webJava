package sec01.ex02;

class Apple {}
class Orange {}
class banana {}

public class ClassCastExceptionTest {
	public static void main(String[] args) {
		Object[] obj = new Object[3];
		
		obj[0] = new Apple();
		obj[1] = new Orange();
		obj[2] = new banana();
		
		Apple apple1 = (Apple)obj[0];
		Apple apple2 = (Apple)obj[1];
		
	}
}
