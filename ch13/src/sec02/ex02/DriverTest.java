package sec02.ex02;

public class DriverTest {
	public static void main(String[] args) {
		Driver driver1 = new Driver(new Truck());
		driver1.drive();
		System.out.println();
		
		driver1.speedUp(new Truck());
		System.out.println();
		
		Driver driver2 = new Driver(new SportsCar());
		driver2.drive();
		System.out.println();

		SportsCar sportsCar = new SportsCar();
		driver2.speedUp(sportsCar);
	}

}
