package sec05.ex02;

import java.util.Arrays;

public class ArraysCopyOfTest {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		
		int[] num1 = new int[5];
		for(int i=0; i< arr1.length;i++) {
			num1[i] = arr1[i];
		}
		
		System.out.println(Arrays.toString(num1));
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOf(arr1, arr1.length - 1);  //인덱스 4-1=3까지 복사합니다.
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr4));
		

		int[] arr5 = Arrays.copyOfRange(arr1, 3, arr1.length);
		System.out.println(Arrays.toString(arr5));
		
		

	}

}
