package sec05.ex01;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car("11가1111", "소나타", "흰색", 2000, 60);
		
		myCar.getCarInfo();
		System.out.println();
		
		myCar.speedUp();
		myCar.speedUp();
		System.out.println("현재 속도 : " + myCar.velocity + "km/h");
		
		myCar.speedDown();
		System.out.println("현재 속도 : " + myCar.velocity + "km/h");
		
		myCar.stop();
		System.out.println("현재 속도 : " + myCar.velocity + "km/h");
		
		myCar.park();
	}

}
