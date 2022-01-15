package sec01.ex03;

public class ArrayForTest {

	public static void main(String[] args) {
		int[] score = new  int[10];
		
//		score[0] = 0;
//		score[1] = 1;
		
		for(int i = 0; i < score.length ; i++) {
			score[i] = i;
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] = " +score[i]);
		}
		
		System.out.println();
		String[] name = {"이순신", "홍길동", "임꺽정"};
		
		for(int i=0; i < name.length; i++) {
			System.out.println("name[" + i + "] = " +name[i]);
			
		}
		
		

	}

}
