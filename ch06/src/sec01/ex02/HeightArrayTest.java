package sec01.ex02;

import java.util.Scanner;

public class HeightArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 정보를 입력해 주세요.");

		double[] height = new double[5];
		int studNum = 0;
		String temp = null;
		while (studNum < height.length) {
			temp = sc.nextLine();
			height[studNum] = Double.parseDouble(temp);
			studNum++;
		}

		double total = height[0] + height[1] + height[2] + height[3] + height[4];
		double average = total / (double)height.length;
		System.out.println("평균 키 : " + average);
		sc.close();
	}

}
