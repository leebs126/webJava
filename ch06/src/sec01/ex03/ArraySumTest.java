package sec01.ex03;

public class ArraySumTest {

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			score[i] = i * 10 + 10;
		}

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		System.out.println("배열 요소들의 합 : " + sum);
		
	}

}
