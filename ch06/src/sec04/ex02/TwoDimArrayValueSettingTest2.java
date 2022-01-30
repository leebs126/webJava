package sec04.ex02;

public class TwoDimArrayValueSettingTest2 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j] = 2;
					
				} else if (i == 1) {
					if (j != 3)
						arr[i][j] = 2;
					else
						arr[i][j] = 1;
					
				} else if (i == 2) {
					if (j == 0 || j == 1)
						arr[i][j] = 2;
					else
						arr[i][j] = 1;
					
				} else if (i == 3) {
					if (j == 0)
						arr[i][j] = 2;
					else
						arr[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
