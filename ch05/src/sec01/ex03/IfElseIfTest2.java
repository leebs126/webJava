package sec01.ex03;

public class IfElseIfTest2 {

	public static void main(String[] args) {
		int score = 78;

		if (score >= 60 && score < 70) {
			System.out.println("D학점입니다.");
		} else if (score >= 70 && score < 80) {
			System.out.println("C학점입니다.");
		} else if (score >= 80 && score < 90) {
			System.out.println("B학점입니다.");
		} else if (score >= 90 && score <= 100) {
			System.out.println("A학점입니다.");
		}
	}

}
