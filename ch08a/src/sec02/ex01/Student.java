package sec02.ex01;

public class Student {
	// 속성을 필드로 구현한다.
	String name;
	int grade;
	
	//기본 생성자
	public Student() {}
	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +", 학년 : " + grade);
		
	}

}