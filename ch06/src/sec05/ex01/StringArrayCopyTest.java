package sec05.ex01;

public class StringArrayCopyTest {

	public static void main(String[] args) {
		String[] strArr = { "apple", "banana", "orange", "mango", "lemon" };
		String[] strDest1 = new String[10];

		System.arraycopy(strArr, 0, strDest1, 0, strArr.length);

		for (int i = 0; i < strDest1.length; i++) {
			System.out.print(strDest1[i] + " ");
		}
		
		System.out.println();
		String[] strDest2 = new String[5];
		System.arraycopy(strArr, 0, strDest2, 2, 3);

		for (int i = 0; i < strDest2.length; i++) {
			System.out.print(strDest2[i] + " ");
		}
		
		
		System.out.println();
		String[] strDest3 = new String[5];
		System.arraycopy(strArr, 2, strDest3, 1, 3);

		for (int i = 0; i < strDest3.length; i++) {
			System.out.print(strDest3[i] + " ");
		}

	}

}
