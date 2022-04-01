package sec02.ex03;

public class Student {
	String name = "홍길동";
	int grade = 3;
	
	//생략하면 컴파일 시 컴파일러가 자동으로 추가해 줍니다.
	public Student() {
		
	}
	
	public Student(String _name) {
		name = _name;
	}
	
	public Student(String _name, int _grade) {
		name = _name;
		grade = _grade;
	}
	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +" , 학년 : " +   grade);
	}
	
	
}
