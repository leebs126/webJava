package sec05.ex02;

public class HelloWorld {

	public static void main(String[] args) {
		if (args.length != 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i] + " ");
			}
		}

		System.out.println("\n프로그램 종료");

	}

}
