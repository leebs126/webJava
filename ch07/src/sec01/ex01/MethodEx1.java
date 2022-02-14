package sec01.ex01;

public class MethodEx1 {

	public static void main(String[] args) {
		MethodEx1 m1 = new MethodEx1();
		m1.print();
		m1.print();
		m1.print();
		
		System.out.println("종료");
	}
	
	public void print() {
		System.out.println("메소드를 호출합니다.");
	}

}
