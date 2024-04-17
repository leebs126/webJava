package sec02.ex02;

public class Person {
	protected String gender;
	protected int age;
	
	public Person() {
		System.out.println("Person 기본 생성자 호출");
	
	}
	public Person(String _gender, int _age) {
		System.out.println("Person 매개변수가 2개인 생성자 호출");
		gender = _gender;
		age = _age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}

}
