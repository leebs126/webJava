package sec04.ex02;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 3);
		System.out.println("학생의 이름 :" + s1.name);
		
//		System.out.println("학생의 학년 :"+s1.grade);
		System.out.println("학생의 학년 :" + s1.getGrade());

	}

}
