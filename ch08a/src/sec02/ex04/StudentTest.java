package sec02.ex04;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();  //기본 생성자를 호출해서 인스턴스를 생성합니다.
//		s.name = "이순신";
//		s.grade = 2;
		s1.getStudInfo();
		
		Student s2= new Student("이순신"); 
		s2.getStudInfo();
		
		Student s3 = new Student(2);
		s3.getStudInfo();
		
		Student s4 = new Student("홍길동", 3);
		s4.getStudInfo();
		
		
//		Student s5= new Student("임꺽정", 3, "서울시 강동구");
//		s5.getStudInfo();
		
	}

}
