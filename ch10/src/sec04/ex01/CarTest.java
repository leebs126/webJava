package sec04.ex01;

public class CarTest {

	public static void main(String[] args) {
		Car car = new SportsCar(100);
		
		car.speedUp();
		System.out.println("차의 속도 : " + car.speed);

	}

}
