package sec03.ex02;

public class TwoDimArrayForTest {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 3 * i + j + 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
			}
		}

	}

}
