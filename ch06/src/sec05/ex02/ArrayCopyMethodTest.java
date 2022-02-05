package sec05.ex02;

import java.util.Arrays;

public class ArrayCopyMethodTest {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 60, 70, 80, 90, 100 };
		int[] arr3 = new int[10];

		//for문으로 배열 복사하기
		for (int i = 0; i < arr3.length; i++) {
			if (i < arr1.length) {
				arr3[i] = arr1[i];
			} else {
				arr3[i] = arr2[i- arr2.length];
			}
		}

		System.out.println(Arrays.toString(arr3));
		
		//System.arraycopy() 메소드 이용하기
		int[] arr4 = new int[arr1.length + arr2.length];
//		System.arraycopy(arr1, 0, arr4, 0, 5);
//		System.arraycopy(arr2, 0, arr4, 5, 5);
//		System.out.println(Arrays.toString(arr4));
		
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.arraycopy(arr2, 0, arr4, arr2.length, arr2.length);
		System.out.println(Arrays.toString(arr4));
	}

}
