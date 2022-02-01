package sec04.ex03;

public class ArrayCrossValueTotalTest {

	public static void main(String[] args) {
		int[][] arr = {{2,  8, 9, 13, 13},
					   {1,  7, 6, 12,  2},
					   {1, 11, 9,  2, 20},
					   {14, 3, 1, 22,  3},
					   {14,16, 5,  3, 33}};
		
		int crossTotal = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j || i + j == 4 ) {
					crossTotal += arr[i][j];
				}
			}
		}
			

		System.out.println("두 대각선 요소들의 합 : " + crossTotal);
		
	}
}
