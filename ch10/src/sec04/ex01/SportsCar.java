package sec04.ex01;

public class SportsCar extends Car {
	
	public SportsCar(int speed) {
		super.speed = speed;
	}

	@Override
	public void speedUp() {
		speed+=10;
	}
	

}
