package sec04.ex01;

import com.oracle.bookshop.Student;
//import com.oracle.bookshop.member.College;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();  
//		com.oracle.bookshop.Student s1 = new com.oracle.bookshop.Student();  //패키지명까지 포함해서 클래스를 지정합니다.
		s1.getStudInfo();
		
		Student s2= new Student("이순신"); 
		s2.getStudInfo();
		
		Student s3 = new Student(2);
		s3.getStudInfo();
		
		Student s4 = new Student("홍길동", 3);
		s4.getStudInfo();
		
//		College college = new College();
		
	}

}
