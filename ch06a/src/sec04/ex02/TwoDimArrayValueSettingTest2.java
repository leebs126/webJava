package sec04.ex02;

public class TwoDimArrayValueSettingTest2 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];

		// 1로 요소들을 초기화합니다.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = 1;
//			}
//		}

		// 값을 2로 세팅합니다.
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i + j < 10) {
					arr[i][j] = 2;
				}else {
					arr[i][j] = 1;
				}
				
			}
		}

		// 배열 값들을 출력합니다.
		System.out.println("배열 값 출력");
		System.out.println("-------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
