package sec01.ex03;

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		//필드 세팅
		s.name = "이순신";
		s.subject = "국어";
		s.grade = 2;
		s.score = 90;
		
		// 인스턴스 메소드 호출
		s.study();
		int score = s.test();
		System.out.println("시험 점수 : " + score);
		
		
		//학생 신상 정보 출력 메소드 호출
		s.getStudInfo();
		

	}

}
