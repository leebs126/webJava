package sec03.ex02;

public class TwoDimArrayLengthTest {

	public static void main(String[] args) {
		int[][] score1 = {{10, 20, 30}, {40, 50, 60},{70, 80, 90}};
		
		System.out.println("score1 1차원 배열 요소 길이 : " + score1.length);
		System.out.println("score1 2차원 배열 요소 길이 : " + score1[0].length);
		System.out.println("score1 2차원 배열 요소 길이 : " + score1[1].length);
		System.out.println("score1 2차원 배열 요소 길이 : " + score1[2].length);
		
		int[][] score2 = {{10, 20, 30}, {40, 50, 60}};
		System.out.println("\n\nscore2 1차원 배열 요소 길이 : " + score2.length);
		System.out.println("score2 2차원 배열 요소 길이 : " + score2[0].length);
		System.out.println("score2 2차원 배열 요소 길이 : " + score2[1].length);
	}
}
