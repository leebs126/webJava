package sec02.ex02;

public class Middle extends Student {
	
	public Middle(String _name, int _grade) {
		System.out.println("매개변수가 2개인 Middle 클래스 생성자 호출");
		name = _name;
		grade = _grade;
	}
	
	
	public Middle(String _name, int _grade, String _gender, int _age) {
		System.out.println("매개변수가 4개인 Middle 클래스 생성자 호출");
		name = _name;
		grade = _grade;
		gender = _gender;
		age = _age;
	}
}
