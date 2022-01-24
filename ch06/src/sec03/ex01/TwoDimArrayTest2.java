package sec03.ex01;

import java.util.Arrays;

public class TwoDimArrayTest2 {

	public static void main(String[] args) {
		int[][] score = new int[3][3];
		int[][] score2 = new int[2][3];
		
		System.out.print(score[0][0]);
		System.out.print(score[0][1]);
		System.out.print(score[0][2]);
		System.out.println();
		
		System.out.print(score[0][0]);
		System.out.print(score[0][1]);
		System.out.print(score[0][2]);
		
		
		
		
//		int[][] score = new int[][] {{ 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
//		int[][] score1 = new int[3][3];
//		score1 = {{ 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}

//		score = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
//		int[][] score = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

	}

}
