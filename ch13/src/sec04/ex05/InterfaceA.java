package sec04.ex05;

public interface InterfaceA {
	public void method1();
	
	public default void defaultMethod() {
		System.out.println("디폴트 메소드입니다.");
	}
	
	public static void staticMethod() {
		System.out.println("static 메소드입니다.");
	}
	
	

}
