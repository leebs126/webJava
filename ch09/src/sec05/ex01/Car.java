package sec05.ex01;

public class Car {
	protected String carName;
	protected String carNumber;
	protected String carColor;
	protected int velocity;
	protected int carSize;

	public Car() {
		System.out.println("Car 클래스 생성자 호출");
	}

	
	public void speedUp(int speed) {
		velocity = velocity + speed;
	}

	public void speedDown(int speed) {
		velocity = velocity - speed;
	}

	public void stop() {
		velocity = 0;
	}
	
	public void park() {
		System.out.println("차를 주차합니다.");
		velocity = 0;
	}

	//차 정보를 출력하는 메소드
	public String getCarInfo() {
		return "차이름 : " + carName + 
				" ,차번호 : " + carNumber + 
				" ,차색상 : " + carColor +
				" ,속도 : " + velocity + "km/h" + 
				" ,차크기 : " + carSize +"cc";
	}

}
