package sec03.ex01;

public class CharVarUseTest {

	public static void main(String[] args) {
		int univNum = 0;  //한국의 대학수
		char grade = 'A';   //학점
		
		//좋은 변수 사용법
		univNum = 235;
		grade = 'A';
		System.out.println("국내 대학수 : " + univNum + ", 학점 : " + grade);
		
		
		//좋지 않은 변수 사용법
		univNum = grade + 210;
		grade = 97 - 32;
		System.out.println("국내 대학수 : " + univNum + ", 학점 : " + grade);

	}

}
