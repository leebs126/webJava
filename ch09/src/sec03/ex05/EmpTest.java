package sec03.ex05;

public class EmpTest {

	public static void main(String[] args) {
		String name;
		int totalPay;
		Regular lee;
		Temp hong;
		
		lee = new Regular("이순신", 2000000, 5000000);
		hong = new Temp("홍길동", 1500000, 0, 500);
		
		System.out.println("사원 정보 출력");
		System.out.println("-----------------------------------------------");
		name = lee.name;
		totalPay = lee.calcTotalPay();
		System.out.println("사원 이름: " + name + ", 총급여: " + totalPay + "원");
		
		name = hong.name;
		totalPay = hong.calcTotalPay(); // 오버라이딩 된 메서드 호출
		System.out.println("사원 이름: " + name + ", 총급여: " + totalPay + "원");

	}

}
