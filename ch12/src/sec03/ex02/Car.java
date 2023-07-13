package sec03.ex02;

public class Car {
	protected int velocity;

	public Car() {
		System.out.println("Car 생성자 호출");
	}

	public final void speedUp() {
		velocity++;
	}

}
