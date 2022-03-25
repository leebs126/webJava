package sec01.ex01;

public class User {
	String name;
	String address;
	String phoneNum;

	public String rentCar() {
		return "그랜저";
	}

	public void dirveCar() {
		System.out.println("시속 80km로 달립니다.");
	}

	public void payCar(int money) {
		System.out.println("렌터카 이용료 : " + money + "원");
	}

}
