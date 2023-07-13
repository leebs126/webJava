package sec08.ex04;

public class Employee {
	private String name;
	private int age;
	private String dept;
	private int salary;
	
	public Employee() {}
	
	
	public Employee(String name,  int age, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String info = name+", " + age +", "  + dept +", "  + salary; 
		return info;
	}
	
	

}
