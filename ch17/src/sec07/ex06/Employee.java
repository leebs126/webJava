package sec07.ex06;


public class Employee implements Comparable<Employee>{
	private int sabun;  //사번
	private String name;
	private String dept;
	private int salary;
	
	public Employee() {}

	public Employee(int sabun, String name, String dept, int salary) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Employee emeployee) {
		if(sabun > emeployee.sabun) {
			return 1;
		}else if(sabun == emeployee.sabun){
			return 0;
		}else {
			return -1;
		}
	}
	
}
