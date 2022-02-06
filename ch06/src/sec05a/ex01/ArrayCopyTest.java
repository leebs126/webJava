package sec05a.ex01;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] src = { 10, 20, 30, 40, 50 };
		int[] dest1 = new int[5];

		for (int i = 0; i < src.length; i++) {
			dest1[i] = src[i];
		}

		for (int i = 0; i < dest1.length; i++) {
			System.out.print(dest1[i] + " ");
		}
		System.out.println();

		int[] dest2 = new int[10];
//		 System.arraycopy(src, 0, dest2, 0, 5);
		System.arraycopy(src, 0, dest2, 0, src.length);
		for (int i = 0; i < dest2.length; i++) {
			System.out.print(dest2[i] + " ");
		}
		System.out.println();

		int[] dest3 = new int[10];
		System.arraycopy(src, 0, dest3, 0, 3);
		for (int i = 0; i < dest3.length; i++) {
			System.out.print(dest3[i] + " ");
		}

	}

}
