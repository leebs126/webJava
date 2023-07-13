package sec01.ex02;

public class Employee extends Person {
	private int salary;
	
	public Employee(String name, int salary) {
		super.name = name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}	
	
	

}
