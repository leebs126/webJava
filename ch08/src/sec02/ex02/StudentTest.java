package sec02.ex02;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s.name = "이순신";
//		s.grade = 2;
		s1.getStudInfo();
		
		
		Student s2 = new Student("이순신");
		s2.getStudInfo();
		
//		Student s3 = new Student(2);
//		s3.getStudInfo();
		
		Student s4 = new Student("이순신", 2);
		s4.getStudInfo();
	}

}
