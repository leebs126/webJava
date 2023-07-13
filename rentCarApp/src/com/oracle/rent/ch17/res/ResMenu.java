package com.oracle.rent.ch17.res;

import java.util.List;
import java.util.Scanner;

import com.oracle.rent.ch17.car.CarException;
import com.oracle.rent.ch17.car.CarVO;
import com.oracle.rent.ch17.common.AbstractBase;

public class ResMenu {
	private List<ResVO> resList;
	Reserve res;
	  
	
	public ResMenu() {
		res = new ReserveImpl();
	}
	
	public void doResMenu() throws ResException, CarException{
		Scanner sc = new Scanner(System.in);
		boolean isWorking = true;
		
		while(isWorking) {
			System.out.println("\n예약 기능을 선택해 주세요.");
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 예약 목록 조회, 2. 예약 정보 조회, 3. 예약 정보 등록, 4. 예약 정보 수정, 5. 예약 정보 삭제, 0. 상위 메뉴로 이동");
			String temp = sc.nextLine();
			int menu2= Integer.parseInt(temp);
			
			switch(menu2) {
			case AbstractBase.MENU_END:
				isWorking = false;	
				break;
				
			case AbstractBase.MENU_RES_LIST:
				menuResList();
				break;
			case AbstractBase.MENU_RES_VIEW:
				menuResView();
				break;
			case AbstractBase.MENU_RES_REG:
				menuResReg();
				break;
				
			case AbstractBase.MENU_RES_MOD:
				menuResMod();
				break;
				
			case AbstractBase.MENU_RES_DEL:
				menuResDel();
				break;
			default:
				isWorking = false;
			}
		}		
		
	}
	private void menuResList() throws ResException{
		resList = res.listResInfo();         			//예약 정보 리스트 출력하기
		((AbstractBase)res).displayData(resList);
	}
	
	private void menuResView() throws ResException{
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 예약 번호:");
		String resNumber = sc.nextLine();
		ResVO resVO = new ResVO();
		resVO.setResNumber(resNumber);
		
		resVO = res.checkResInfo(resVO);         			
		((AbstractBase)res).displayData(resVO);
	}

	
	
	private void menuResReg() throws ResException, CarException{
		//예약 하기 전 예약할 렌터카를 먼저 리스트로 조회합니다.
		AbstractBase.listCarData();  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n예약 정보를 입력해 주세요.");
		System.out.println("-----------------------------------------------");
		System.out.print("예약번호:");
		String resNumber = sc.nextLine();
		
		System.out.print("예약일:");
		String resDate = sc.nextLine();
		
		System.out.print("예약 차번호:");
		String resCarNumber = sc.nextLine();
		
		System.out.print("사용시작날짜:");
		String useBeginDate = sc.nextLine();
		
		System.out.print("차반납일:");
		String returnDate = sc.nextLine();

		
		ResVO resVO = new ResVO(resNumber, resCarNumber, resDate,  useBeginDate, returnDate);
		res.regResInfo(resVO); 						//새 예약 등록하기			
		
		//예약 정보 추가 후 리스트로 보여 줍니다.
		menuResList();
		
	}
	
	private void menuResMod() throws ResException{
		//예약 정보 수정 전 리스트로 보여 줍니다.
		menuResList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n수정할 예약 정보를 차례대로 입력해 주세요.");
		System.out.println("-----------------------------------------------");
		System.out.print("예약번호:");
		String resNumber = sc.nextLine();
		
		System.out.print("예약일:");
		String resDate = sc.nextLine();
		
		System.out.print("예약 차번호:");
		String resCarNumber = sc.nextLine();
		
		System.out.print("사용시작날짜:");
		String useBeginDate = sc.nextLine();
		
		System.out.print("차반납일:");
		String returnDate = sc.nextLine();

		
		ResVO resVO = new ResVO(resNumber, resCarNumber, resDate,  useBeginDate, returnDate);
		res.modResInfo(resVO); 						//기존 예약 수정하기			
		
		//예약 정보 추가 후 리스트로 보여 줍니다.
		menuResList();
		
		
	}
	
	private void menuResDel() throws ResException{
		menuResList();
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 예약 번호 입력:");
		String resNumber = sc.nextLine();
		ResVO resVO = new ResVO();
		resVO.setResNumber(resNumber);
		res.cancelResInfo(resVO);
		
		//예약 정보 삭제 후 리스트로 보여 줍니다.
		menuResList();
		
		
	}
	
	

}
