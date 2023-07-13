package sec01.ex02;

public class StudentTest {

	public static void main(String[] args) {
		Student s= new College("홍길동",3,20);
//		int courses = s.getCourses();
		College c= (College)s;
		int courses = c.getCourses();
		System.out.println("학점은>> "+ courses+"점");
	}
}
