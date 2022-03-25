package sec01.ex02;

public class StudentTest {

	public static void main(String[] args) {
		//인스턴스 생성
//		new Student();
		
		Student s = new Student();
		String name = s.name;
		int grade = s.grade;
		
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		
		
		s.name = "홍길동";
		s.grade = 3;
		
		name = s.name;
		grade = s.grade;
		System.out.println("\n이름 : " + name);
		System.out.println("학년 : " + grade);
		

	}

}
