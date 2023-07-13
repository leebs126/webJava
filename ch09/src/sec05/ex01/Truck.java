package sec05.ex01;

public class Truck extends Car {
	private int load; // 적재화물량

	public Truck(String carName, String carNumber, String carColor, int carSize, int velocity, int load) {
		System.out.println("Truck 클래스 생성자 호출");
		super.carName = carName;
		super.carNumber = carNumber;
		super.carColor = carColor;
		super.velocity = velocity;
		super.carSize = carSize;
		this.load = load;
	}

	public int getLoad() {
		return load;
	}

	public void setLoad(int load) {
		this.load = load;
	}

	// 화물을 운반하는 기능
	public void carryLoad() {
		if (load > 0) {
			load++;
		} else {
			load = 0;
		}
	}

}
