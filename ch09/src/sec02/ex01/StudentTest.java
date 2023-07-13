package sec02.ex01;

public class StudentTest {

	public static void main(String[] args) {
		String sinsang = null;
		Middle m = new Middle("이순신", 2);
		College c = new College("홍길동", 3, 20);
		
		sinsang = m.getStudInfo();
		System.out.println("\n학생정보");
		System.out.println("-------------------------------------------");
		System.out.println(sinsang);
		
		sinsang = c.getStudInfo();
		System.out.println("\n학생정보");
		System.out.println("-------------------------------------------");
		System.out.println(sinsang + ", 수강학점: " + c.getCourses() + "점");

	}

}
