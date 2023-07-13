package sec05.ex01;

public class CarTest {

	public static void main(String[] args) {
		// 1.변수 선언
		Sedan myCar = null;
		Truck truck = null;
		Bus bus = null;

		// 2.인스턴스 생성
		myCar = new Sedan("아반테","111가1111", "은색", 60, 2000); 
		truck = new Truck("1톤 포터","222나2222", "청색", 3000, 60, 1); 
		bus = new Bus("1001번 버스", "333다3333", "노란색", 4000, 60, 20, 1000); 

		// 3.메소드 호출
		System.out.println(myCar.getCarInfo());
		System.out.println(truck.getCarInfo() + ", 적재량 : " + truck.getLoad() + "톤");
		System.out.println();
		
		truck.speedUp(10); // 트럭의 속도를 10증가합니다.
		truck.carryLoad(); // 트럭이 짐을 운반합니다.

		//트럭과 버스 정보를 출력합니다.
		System.out.println(truck.getCarInfo() + ", 적재량 : " + truck.getLoad() + "톤");
		System.out.println(bus.getCarInfo() + ", 승객수 : " + bus.getPassenger() + "명 , 승차요금 : " + bus.getFee() + "원");
		bus.ridePassenger();
		System.out.println(bus.getCarInfo() + ", 승객수 : " + bus.getPassenger() + "명 , 승차요금 : " + bus.getFee() + "원");

	}

}
