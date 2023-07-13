package sec01.ex03;

public class StudentTest {
	public static void main(String[] args) {
		//Student s= new Student( );
		Student s= new College ("홍길동",3,22,"차범근");
		Middle m = new Middle("이순신",2,"손흥민");
		String sinsang = s.getStudInfo();
		System.out.println("학생 정보 :"+sinsang);
		
		System.out.println();
		String teacher = ((College)s).getProfessor();
		System.out.println(teacher);
		
		System.out.println();
		teacher = m.getTeacher();
		System.out.println(teacher);
		

	}

}
