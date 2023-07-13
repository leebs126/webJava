package sec04.ex05;

public class DefaultTest {

	public static void main(String[] args) {
		InterfaceA interfaceA = new ImplA();
		interfaceA.defaultMethod();
		InterfaceA.staticMethod();
	}

}
