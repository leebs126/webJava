package sec02.ex02;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {

        Random random1 = new Random();

        System.out.println( random1.nextInt()); // -2,147,483,648 ~ 2,147,483,647 사이의 값
        System.out.println( random1.nextInt(5));  // 0 ~ 5 사이의 값
        System.out.println( random1.nextInt(5) + 1);  //1 ~ 6 사이의 값
        System.out.println(random1.nextDouble());  //0.0 ~ 1.0사이의 실수
        System.out.println( random1.nextBoolean());  //true or false

        System.out.println();
        Random random2 = new Random(10);
        System.out.println(random2.nextInt(10));  //3
	}

}
