package com.oracle.rent.ch19.car;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.oracle.rent.ch19.common.AbstractBase;


public class CarMenu {
	private List<CarVO> carList;
	public static Car car;
	
	public CarMenu() {
		car = new CarImpl();
	}
	
	public void doCarMenu() throws CarException, IOException {
		Scanner sc = new Scanner(System.in);
		boolean isWorking = true;
		
		while(isWorking) {
			System.out.println("\n렌터카 기능을 선택해 주세요.");
			System.out.println("------------------------------------------------------------");
			System.out.println("1. 렌터카 목록 조회, 2. 렌터카 정보 조회, 3. 렌터카 정보 등록, 4. 렌터카 정보 수정, 5. 렌터카 정보 삭제, 0. 상위 메뉴로 이동");
			
			String temp = sc.nextLine();
			int menu2= Integer.parseInt(temp);
			
			switch(menu2) {
			case AbstractBase.MENU_END:
				isWorking = false;	
				break;
				
			case AbstractBase.MENU_CAR_LIST:
				menuCarList();
				break;
			case AbstractBase.MENU_CAR_VIEW:
				menuCarView();
				break;
			case AbstractBase.MENU_CAR_REG:
				menuCarReg();
				break;
				
			case AbstractBase.MENU_CAR_MOD:
				menuCarMod();
				break;
				
			case AbstractBase.MENU_CAR_DEL:
				menuCarDel();
				break;
			default:
				isWorking = false;
			}
		}		
		
	}
	private void menuCarList() throws CarException, IOException {
		carList = car.listCarInfo();         			//렌터카 리스트 출력하기
		((AbstractBase)car).displayData(carList);
	}
	
	private void menuCarView() throws CarException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 렌터카 번호:");
		String carNumber = sc.nextLine();
		CarVO carVO = new CarVO();
		carVO.setCarNumber(carNumber);
		
		//조회한 렌터카 정보만 보여줍니다.
		carVO = car.checkCarInfo(carVO);         			
		((AbstractBase)car).displayData(carVO);
	}

	
	
	private void menuCarReg() throws CarException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n등록 차 정보를 차례대로 입력해 주세요.");
		System.out.println("-----------------------------------------------");
		System.out.print("차번호:");
		String carNumber = sc.nextLine();
		
		System.out.print("차이름:");
		String carName = sc.nextLine();
		
		System.out.print("차색상:");
		String carColor = sc.nextLine();
		
		System.out.print("배기량:");
		String temp = sc.nextLine();
		int carSize= Integer.parseInt(temp);

		System.out.print("제조사:");
		String carMaker = sc.nextLine();
		
		CarVO carVO = new CarVO(carNumber, carName, carColor, carSize, carMaker);
		car.regCarInfo(carVO); 						// 렌터카 등록하기			
		
		//렌터카 정보 추가 후 리스트로 보여 줍니다.
		menuCarList();
	}
	
	private void menuCarMod() throws CarException, IOException {
		menuCarList();
		//렌터카 정보 수정 후 리스트로 보여 줍니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("\n수정할 차 정보를 차례대로 입력해 주세요.");
		System.out.println("-----------------------------------------------");
		System.out.print("차번호:");
		String carNumber = sc.nextLine();
		
		System.out.print("차이름:");
		String carName = sc.nextLine();
		
		System.out.print("차색상:");
		String carColor = sc.nextLine();
		
		System.out.print("배기량:");
		String temp = sc.nextLine();
		int carSize= Integer.parseInt(temp);


		System.out.print("제조사:");
		String carMaker = sc.nextLine();
		
		CarVO carVO = new CarVO(carNumber, carName, carColor, carSize, carMaker);
		car.modCarInfo(carVO); 						// 렌터카 수정하기			
		
		//렌터카 정보 추가 후 리스트로 보여 줍니다.
		menuCarList();
		
	}
	
	private void menuCarDel() throws CarException, IOException {
		menuCarList();
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원 차번호 입력:");
		String carNumber = sc.nextLine();
		CarVO carVO = new CarVO();
		carVO.setCarNumber(carNumber);
		car.delCarInfo(carVO);
		
		//렌터카 정보 삭제 후 리스트로 보여 줍니다.
		menuCarList();
		
	}

}
