package sec02.ex02;

public class CarTest {

	public static void main(String[] args) {
		// Car c1 = new Car( );
		
		Truck t = new Truck();
		Car c = new SportsCar();  //인터페이스 타입으로 업캐스팅으로 사용 가능
		
		
		// Car.SAFE_SPEED = 80;
		System.out.println("모든 차의 안전 속도 : " + Car.SAFE_SPEED);
		System.out.println();
		
		
		t.speedUp();
		t.speedDown();
		t.stop();
		System.out.println();
		
		c.speedUp();
		c.speedDown();
		c.stop();
		System.out.println();
		
		// c.turbo( ); //업캐스팅 상태에서 구현 클래스의 메소드에 접근할 수 없습니다.
		SportsCar s =(SportsCar)c; 
		s.turbo(); //다운 캐스팅 후, 구현 클래스의 메소드에 접근합니다.
		

	}

}
