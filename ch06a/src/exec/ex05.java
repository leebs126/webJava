package exec;

//5.	다음 두 배열의 값들을 비교해서 오름차순으로 출력해 보세요.
//int[] num1 = {34, 56, 78, 7, 23, 46, 43, 55};
//int[] num2 = {12, 34, 2, 99, 18};

//1. 두 배열의 길이의 합을 가지는 배열을 생성한다.
//2. 새 배열에서 두 배열의 값들을 이어서 복사한다.
//3. 새 배열의 값들을 비교해서 오름차순으로 출력한다.

public class ex05 {

	public static void main(String[] args) {
		int[] num1 = {34, 56, 78, 7, 23, 46, 43, 55};
		int[] num2 = {12, 34, 2, 99, 18};

		//1. 두 배열의 길이의 합을 가지는 배열을 생성한다.
		int[] num3 = new int[num1.length + num2.length];
		
		//2. 새 배열에서 두 배열의 값들을 이어서 복사한다.
		System.arraycopy(num1, 0, num3, 0, num1.length);
		System.arraycopy(num2, 0, num3, num1.length, num2.length);
		
		//3. 새 배열의 값들을 비교해서 오름차순으로 출력한다.		
		int temp = 0;
		for(int i=0; i< num3.length;i++) {
			for(int j=i+1; j < num3.length;j++ ) {
				if(num3[i] > num3[j]) {
					temp = num3[i];
					num3[i] = num3[j];
					num3[j] = temp;
				}
			}
		}
		
		for(int i=0; i< num3.length;i++) {
			System.out.print(num3[i] +" ");
		}
		

	}

}
