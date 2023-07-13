package sec05.ex01;

public class Bus extends Car {
	private int passenger; // 버스 승객 수
	private int fee;

	// 생성자
	public Bus(String carName, String carNumber, String carColor, int carSize, int velocity, int passenger, int fee) {
		System.out.println("Bus 클래스 생성자 호출");
		super.carName = carName;
		super.carNumber = carNumber;
		super.velocity = velocity;
		super.carSize = carSize;
		this.passenger = passenger;
		this.fee = passenger * fee; // 초기화 시 승객수에 탑승 요금을 곱한값으로 초기화
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	//승객을 태우는 기능
	public void ridePassenger() {
		if (passenger > 0) {
			passenger++;
			fee += 1000;
		}
	}
	

}
