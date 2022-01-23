package sec02.ex03;


//1에서 100사이의 중복되지 않는 정수 10개를 구한 후, 오름차순으로 출력해보세요.
public class ArrayAscSortingTest3 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int temp =0, rand = 0;
		boolean overlapped = false;
		int idx = 0;
		
		while(true) {
			//정수를 얻는다.
			rand = (int)(Math.random() * 100) + 1;
			
			//정수와 요소값이 중복되는지 확인하다.
			for(int i=0; i< num.length; i++) {
				if(rand == num[i]) {
					overlapped = true;
					break;
				}
			}
			
			if(overlapped == false) {
				num[idx] = rand;
				idx++;
			}else {
				overlapped = false;
			}
			
			if(idx == 10)
				break;
			
			
		}
		
		
		
		

		System.out.println("정렬 전 배열 값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		// 배열 오름 차순으로 정렬하기
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.println("\n\n정렬 후 배열 값");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
