package sec01.ex01;

public class ArrayUseTest {

	public static void main(String[] args) {
		int[] score = new int[5];
//
		score[0] = 50;
//		score[0] = 50.5;
		score[1] = 60;
		score[2] = 70;
		score[3] = 80;
		score[4] = 90;
//		score[5] = 100;
//		int[] score = new int[]{50, 60, 70, 80, 90};
//		int[] score = {50, 60, 70, 80, 90}; 
		

		System.out.println("score[0]=" + score[0]);
		System.out.println("score[1]=" + score[1]);
		System.out.println("score[2]=" + score[2]);
		System.out.println("score[3]=" + score[3]);
		System.out.println("score[4]=" + score[4]);
//		System.out.println("score[5]" + score[5]);

		int total = score[0] + score[1] + score[2] + score[3] + score[4];
		double average = total / 5.0;

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);

	}

}
