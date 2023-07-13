package sec02.ex02;

public class Driver {
//	private Car car = new Truck();
	private Car car;
	
	public Driver(Car car){
		this.car = car;		
	}
	
	public void drive() {
		car.speedUp();
		car.speedDown();
		car.stop();
	}
	
	public void truckDrive() {
		Car car = new Truck();  //지역변수에서 업캐스팅으로 사용됩니다.
		car.speedUp();
		car.speedDown();
		car.stop();
	}
	
	public void speedUp(Car car) {
		if(car instanceof Truck) {
			Truck truck = (Truck)car;
			truck.speedUp();
		}else if (car instanceof SportsCar) {
			SportsCar sportsCar = (SportsCar)car;
			sportsCar.speedUp();
		}
	}
	


}
