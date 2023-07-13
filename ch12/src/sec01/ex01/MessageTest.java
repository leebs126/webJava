package sec01.ex01;

public class MessageTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Hello h = new Hello();
		h.getHello();

	}
}

class Hello{
	public void getHello() {
		System.out.println("Hello World!!");
	}
}
