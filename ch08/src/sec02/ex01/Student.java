package sec02.ex01;

public class Student {
	String name;
	int grade;
	
	//생략하면 컴파일 시 컴파일러가 자동으로 추가해 줍니다.
	public Student() {
		
	}

	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +" , 학년 : " +   grade);
	}
	
	
}
