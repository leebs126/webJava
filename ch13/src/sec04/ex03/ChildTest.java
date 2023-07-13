package sec04.ex03;

public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.test();
		c.method1();
		c.method2();
		System.out.println();
		
		ITest i = new Child(); //업캐스팅으로 사용 가능합니다.
		i.test();  
//		 i.method1( );
//		 i.method2( );
		
		System.out.println();
		ITest1 i1 = (ITest1)i;  //하위 인터페이스로 다운 캐스팅 후 하위 메소드 호출
		i1.method1();
	}

}
