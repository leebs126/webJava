package sec04.ex01;

public class MatrixAddTest {

	public static void main(String[] args) {
		int[][] matA = {{2,  3,  5}, 
				        {6,  7,  8}, 
				        {9, 10, 11}};
		
		int[][] matB = {{ 1,  4,  7}, 
		        		{13,  3,  2}, 
		        		{ 3,  9, 20}};
		
		int[][] matC = new int[matA.length][matA[0].length];
		
		//두 행렬의 합을 구합니다.
		for(int i=0; i < matA.length;i++) {
			for(int j = 0 ; j<matA[i].length;j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}

		//두 행렬의 합을 출력합니다.
		System.out.println("두 행렬의 합");
		System.out.println("------------------");
		for(int i=0; i < matC.length;i++) {
			for(int j = 0 ; j<matC[i].length;j++) {
				System.out.print( matC[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
