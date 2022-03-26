package sec01.ex03;


public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "이순신";
		s.subject = "국어";
		s.grade = 2;
		s.score = 90;
		
		s.study();
		int score = s.test();
		System.out.println("시험 점수 : " + score);
	
		s.getStudInfo();

	}

}
