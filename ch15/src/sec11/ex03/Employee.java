package sec11.ex03;

public class Employee {
	private String name;
	private String dept;
	private String job;
	private int salary;

	public Employee(String name, String dept, String job, int salary) {
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.salary = salary;
	}

	public String toString() {
		String info = "사원의 이름:" + name +"\n"
				  + "사원의 부서: " + dept +"\n"
				  + "사원의 직급: " + job +"\n"
				  + "급여: " + salary + "원";
		return info;
	}
}
