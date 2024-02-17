package sec04.ex01;

import java.util.Scanner;

public class WhileBreakTest {

	public static void main(String[] args) {
		  int num = 0;
	      Scanner sc = new Scanner(System.in);

	      while(true) {
//	      for(;;) {
//	      for(;true;) {
	         System.out.println("---------------------------------------");
	         System.out.println("1:회원, 2:렌터카, 3:예약, 4:종료 ");
	         System.out.println("---------------------------------------");
	         System.out.print("메뉴 번호 선택:");
	         String temp = sc.nextLine();
	         num = Integer.parseInt(temp);
	   
	         if(num == 1) {
	            System.out.println("1.회원 메뉴를 선택하셨습니다.");
	         }else if(num == 2) {
	            System.out.println("2.렌터카 메뉴를 선택하셨습니다.");
	         }else if(num == 3) {
	            System.out.println("3.예약 메뉴을 선택하셨습니다.");
	         }else {
	            System.out.println("종료합니다.");
	            break;
	         }
	         System.out.println();
	      }
	   }

}
