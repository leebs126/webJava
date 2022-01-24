package sec03.ex01;

public class TwoDimArrayTest {

	public static void main(String[] args) {
		int[][] score1 = new int[3][3];
		int[][] score2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
		
//		int[][] score2 = new int[3][3];
//		score3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

		System.out.println("score1 배열 값 출력");
		System.out.print(score1[0][0] + " ");
		System.out.print(score1[0][1] + " ");
		System.out.print(score1[0][2]);
		System.out.println();
		
		System.out.print(score1[1][0] + " ");
		System.out.print(score1[1][1] + " ");
		System.out.print(score1[1][2]);
		System.out.println();
		
		System.out.print(score1[2][0] + " ");
		System.out.print(score1[2][1] + " ");
		System.out.print(score1[2][2] );
		
		System.out.println("\n\nscore2 배열 값 출력");
		System.out.print(score2[0][0] + " ");
		System.out.print(score2[0][1] + " ");
		System.out.print(score2[0][2]);
		System.out.println();
		
		System.out.print(score2[1][0] + " ");
		System.out.print(score2[1][1] + " ");
		System.out.print(score2[1][2]);
		System.out.println();
		
		System.out.print(score2[2][0] + " ");
		System.out.print(score2[2][1] + " ");
		System.out.print(score2[2][2] );

	}

}
