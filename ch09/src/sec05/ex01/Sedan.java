package sec05.ex01;

public class Sedan extends Car {
	public Sedan(String carName, String carNumber, String carColor, int velocity, int carSize) {
		System.out.println("Sedan 클래스 생성자 호출");
		super.carName = carName;
		super.carNumber = carNumber;
		super.carColor = carColor;
		super.velocity = velocity;
		super.carSize = carSize;
	}
}
