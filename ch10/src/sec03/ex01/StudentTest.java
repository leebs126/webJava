package sec03.ex01;

public class StudentTest {

	public static void main(String[] args) {

		String sinsang = null;
		Person p1 = new Middle("이순신", 2, "남", 15);
		Person p2 = new College("홍길동", 3, 22, "남", 22);
		
		System.out.println();
		sinsang = ((Student)p1).getStudInfo();
		System.out.println("학생정보: " + sinsang);
		
		System.out.println();
		sinsang = ((Student)p2).getStudInfo();
		System.out.println("학생정보: " + sinsang);
		
		System.out.println();
		sinsang = ((College)p2).getStudInfo();
		System.out.println("학생정보: " + sinsang);
		
	}

}
