package sec01.ex01;

public class Employee extends Person {
	private int salary;
	
	public Employee(String name, int salary) {
		super.name = name;
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}	
	
	
	@Override
	public String toString() {
		String info = " 이름: " + name +", 급여: " + salary;
		return info;
	}

}
