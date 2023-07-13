package sec07.ex01;

public class Exec06 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "이순신", "임꺽정"};
		int[][] score= {{89, 77, 90},
						{67, 87, 66},
						{66, 77, 88}
						};
		
		int[] total = new int[3];  //학생별로 총점을 저장하는 배열
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length; j++) {
				total[i] += score[i][j];
			}
		}
		
		//학생별로 총점에 대한 평균을 구한 후 출력합니다.
		double average = 0.0;
		System.out.println("---------------------");
		System.out.println("이름\t총점\t평균");
		System.out.println("---------------------");
		for(int i=0; i <total.length;i++) {
			average = total[i]/ 3.0;
			System.out.printf("%s\t%d\t%.1f", name[i], total[i], average );
			System.out.println();
			average = 0.0;
		}

	}
}
