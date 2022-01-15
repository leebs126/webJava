package sec01.ex03;

public class ArrayForTest {

	public static void main(String[] args) {

		int[] score = new int[10];

		for (int i = 0; i < 10; i++) {
			score[i] = i;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("score[" + i + "] = " + score[i]);

		}
		
		System.out.println();
		
		String[] name = {"이순신", "홍길동", "임꺽정"};
		
		for(int i=0; i<name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}
		
	}

}
