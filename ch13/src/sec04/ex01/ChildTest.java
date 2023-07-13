package sec04.ex01;

public class ChildTest {

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		System.out.println();
		
		ITest1 i1 = new Child(); // 업캐스팅으로 사용가능
		i1.method1();  
//		i2.method2();   //업캐스팅 시 자신의 추상 메소드만 호출 가능
		System.out.println();
		
		ITest2 i2 = new Child(); 
//		i2.method1();  //업캐스팅 시 자신의 추상 메소드만 호출 가능
		i2.method2();
		

	}

}
