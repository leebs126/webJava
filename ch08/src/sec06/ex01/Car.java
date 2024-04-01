package sec06.ex01;

public class Car {
	//필드
	String carNumber;
	String carName;
	String carColor;
	int carSize;
	int velocity;
	
	//생성자
	public Car() {
		System.out.println("기본 Car 클래스 생성자 호출");
		
	}
	
	
	public Car(String _carNumber, String _carName, String _carColor, int _carSize, int _velocity ){
		System.out.println("매개변수가 있는 Car 클래스 생성자 호출");
		carNumber = _carNumber;
		carName = _carName;
		carColor = _carColor;
		carSize = _carSize;
		velocity = _velocity;
	}
	
	public void speedUp() {
		velocity = velocity + 1;
	}
	
	
	public void speedDown() {
		velocity = velocity - 1;
		if(velocity < 0) {
			velocity = 0;
		}
	}
	
	public void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");
		velocity = 0;
	}
	
	public void park() {
		System.out.println("주차합니다.");
		velocity = 0;
	}
	
	
	
	public void getCarInfo() {
		System.out.println("차번호 : " + carNumber +
				            "\n차이름 : " + carName +
				            "\n차색상 : " +carColor + 
				            "\n배기량 : " + carSize+ "cc" +  
				            "\n현재 속도 : " + velocity + "km/h");
		
	}
	
	
	
	
	
	

}
