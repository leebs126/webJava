package sec05.ex01;

import java.util.Arrays;

public class ArraysToStringTest {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40,50};
		
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i] +", ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr1));

	}

}
