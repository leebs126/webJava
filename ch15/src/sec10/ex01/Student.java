package sec10.ex01;

public class Student {
	String name;
	int grade;
	Address address;

	public Student(String name, int grade, Address address) {
		this.name = name;
		this.grade = grade;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
