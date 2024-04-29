package sec03.ex01;

public class Person {
	protected String gender;
	protected int age;

	public Person() {
		System.out.println("Person 클래스 기본 생성자 호출");
	}
	
	

	public Person(String gender, int age) {
		this.gender = gender;
		this.age = age;
	}



	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

}
