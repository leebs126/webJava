package sec01.ex03;

public class Student {
	// 속성을 필드로 구현한다.
	String name;
	String subject;  //과목 필드
	int grade;
	int score;  // 시험 점수 필드

	// 기능을 메소드로 구현합니다.
	public void study() {
		System.out.println("오늘 공부 과목 : " + subject);
	}

	public int test() {
		System.out.println(subject +" 시험을 칩니다.");
		return score;
	}
	
	//학생 신상 정보 출력 메소드
	public void getStudInfo() {
		System.out.println("이름 : " + name +", 학년 : " + grade);
		
	}

}