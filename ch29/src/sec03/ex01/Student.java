package sec03.ex01;

public class Student {
	@MyAnnotation
	public void method1() {
		System.out.println("method1 호출");
	}
	
	@MyAnnotation(name = "이순신")
	public void method2() {
		System.out.println("method2 호출");
	}
	
	@MyAnnotation(name = "박지성", address = "부산시")
	public void method3() {
		System.out.println("method3 호출");
	}

}