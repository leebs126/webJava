package sec02.ex03;

public class ArrayAscSortingTest2 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int temp = 0, rand = 0;
		
		for(int i=0; i<num.length;i++) {
			rand = (int) (Math.random() * 100) + 1;
			num[i] = rand;
		}
		
		
		System.out.println("정렬 전 배열값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1 ; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\n\n정렬 후 배열값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
