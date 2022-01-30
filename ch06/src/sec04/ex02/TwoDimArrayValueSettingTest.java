package sec04.ex02;

public class TwoDimArrayValueSettingTest {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1;
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length - i; j++) {
				arr[i][j] = 2;
			}
		}
		
		System.out.println("2차원 배열 값");
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
