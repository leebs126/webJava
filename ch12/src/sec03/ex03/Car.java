package sec03.ex03;

public class Car {
	public static final int SAFE_SPEED = 60; // 안전 속도

	private int velocity;
	private String carName;

	public Car(int velocity, String carName) {
		this.velocity = velocity;
		this.carName = carName;
	}

	public static void main(String args[]) {
		System.out.println("안전 속도 : " + Car.SAFE_SPEED);
		
//		Car.SAFE_SPEED = 80;  //상수는 변경할 수 없습니다.
		Car myCar = new Car(Car.SAFE_SPEED, "아반테");
		Car yourCar = new Car(Car.SAFE_SPEED, "소나타");
	}
}
