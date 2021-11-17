package sec05.ex02;

public class RealNumPrintfTest {

	public static void main(String[] args) {
		float num1 = 6.5E5F;
		double num2 = 7.654321E-5d;
		double num3 = 3123.14159234234563;

		System.out.printf("%f\n", num1);
		System.out.printf("%15.5f\n", num1);
		System.out.printf("%-15.05f\n\n", num1);

		System.out.printf("%f\n", num2);
		System.out.printf("%15.9f\n", num2);
		System.out.printf("%-15.09f\n\n", num2);

		System.out.printf("%e\n", num3);
		System.out.printf("%15.7e\n", num3);
		System.out.printf("%-15.07e\n", num3);

	}

}
