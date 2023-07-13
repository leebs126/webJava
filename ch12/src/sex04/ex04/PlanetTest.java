package sex04.ex04;

import java.util.Scanner;

public class PlanetTest {
	
	public static void planetArea(float radius) {
		
	}
	
	public static void planetVolume(float radius) {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행성 이름을 입력 : ");
		String planet = sc.nextLine();
		
		System.out.print("행성의 반지름을 입력 : ");
		float radius = sc.nextFloat();
		
		System.out.println("----------------------------");
		System.out.println("행성 이름 : " + planet);
		System.out.println("행성 반지름 : " +  radius +"km");
		
		//여기에 작성하세요.
		
		sc.close();

	}

}
