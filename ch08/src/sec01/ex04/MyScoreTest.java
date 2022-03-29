package sec01.ex04;

public class MyScoreTest {

	public static void main(String[] args) {
		String[] name = {"홍길동", "이순신"};
		int[] score1 = {77, 87, 90, 88, 72};
		int[] score2 = {81, 67, 91, 77, 83};
		
		//클래스 인스턴스 생성
		MyArrays myArray = new MyArrays();
		MyMath myMath = new MyMath();
		
		//홍길동 시험 점수 구해서 총점, 평균 출력하기
		double total = myArray.arrayTotal(score1);
		double _avg = myMath.average(total, score1.length);
		int avg = myMath.round(_avg);

		System.out.print(name[0]+"의 시험 점수 : " );
		myArray.arraySortAsc(score1);
		System.out.println("\n총점 : " + total);
		System.out.println("평균 : " + avg);
		
		System.out.println("----------------------------------------");
		//이순신 시험 점수 구해서 총점, 평균 출력하기
		total = myArray.arrayTotal(score2);
		_avg = myMath.average(total, score2.length);
		avg = myMath.round(_avg);
		
		System.out.print(name[1]+"의 시험 점수 : " );
		myArray.arraySortAsc(score2);
		System.out.println("\n총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
		

	}

}
