package sec05a.ex01;

public class TwoArrayCopyTest {

	public static void main(String[] args) {
		int[] src1 = { 10, 20, 30, 40, 50 };
		int[] src2 = { 60, 70, 80, 90, 100 };
		int[] dest1 = new int[10];

		for (int i = 0; i < dest1.length; i++) {
			if (i < src1.length) {
				dest1[i] = src1[i];
			} else {
				dest1[i] = src2[i - src1.length];
			}
		}

		for (int i = 0; i < dest1.length; i++) {
			System.out.print(dest1[i] + " ");
		}
		System.out.println();

		int[] dest2 = new int[src1.length + src2.length];
		System.arraycopy(src1, 0, dest2, 0, src1.length);
		System.arraycopy(src2, 0, dest2, src1.length, src2.length);
		
		for (int i = 0; i < dest2.length; i++) {
			System.out.print(dest2[i] + " ");
		}

	}

}
