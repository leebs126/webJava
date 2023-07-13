package com.oracle.rent.ch19.main;

import java.util.Scanner;

import com.oracle.rent.ch19.car.CarMenu;
import com.oracle.rent.ch19.common.AbstractBase;
import com.oracle.rent.ch19.common.exception.RentException;
import com.oracle.rent.ch19.member.MemberMenu;
import com.oracle.rent.ch19.res.ResMenu;



public class RentCarApp {
	public static void main(String[] args) {
		MemberMenu memberMenu = new MemberMenu(); 	//회원 메뉴 기능
		CarMenu    carMenu = new CarMenu();			//렌터카 메뉴 기능
		ResMenu    resMenu = new ResMenu();			//예약 메뉴 기능
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("\n메뉴를 선택하세요.");
				System.out.println("------------------------------------------------------------");
				System.out.println("1. 회원 기능, 2. 렌터카 기능, 3. 예약 기능, 0. 프로그램 종료");
				String temp = sc.nextLine();
				int menu1= Integer.parseInt(temp);
				
				switch(menu1){
				case AbstractBase.MENU_MEMBER: 
					memberMenu.doMemberMenu();
					break;
				case AbstractBase.MENU_CAR:
					carMenu.doCarMenu();
					break;
				case AbstractBase.MENU_RES:
					resMenu.doResMenu();
					break;
				case AbstractBase.MENU_END:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				
			}catch(RentException e) {
				System.out.println(e.getRentExceptionInfo());
			}catch(Exception e) {
				e.printStackTrace();
			} finally {
			}
			
		}// end while
		
		
	}

}
