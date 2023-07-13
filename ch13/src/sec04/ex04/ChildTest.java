package sec04.ex04;

public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
		System.out.println();

		ITest1 i1 = new Child();
		i1.method1();  
//		i1.method2();  //인터페이스에 선언되지 않은 메소드는 호출 불가능합니다.
//		i1.method3();
		
		ITest3 i3 = new Child();
		i3.method1();  //상속받으므로 상위 메소드를 모두 호출할 수있습니다.
		i3.method2();
		i3.method3();
	}

}
