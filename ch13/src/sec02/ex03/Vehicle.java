package sec02.ex03;

public class Vehicle {
	
	public Truck getTruck() {
		Truck truck = new Truck();
		return truck;
	}

	public Car getSportsCar() {
		SportsCar sportsCar = new SportsCar();
		return sportsCar;
	}
	
}
