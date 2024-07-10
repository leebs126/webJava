package com.oracle.rent.ch17.common;

import java.util.Calendar;
import java.util.List;

import com.oracle.rent.ch17.car.CarVO;
import com.oracle.rent.ch17.member.MemberVO;
import com.oracle.rent.ch17.res.ResVO;

public abstract class AbstractBase {
	//렌터카 프로그램 상위 메뉴 목록
	public static final int MENU_END = 0;    		//종료
	public static final int MENU_MEMBER = 1;  		//회원 기능
	public static final int MENU_CAR = 2;     		//렌터카 기능
	public static final int MENU_RES = 3;    		//예약 기능
	
	//렌터카 프로그램 하위 메뉴 목록
	public static final int MENU_MEMBER_LIST = 1;  //회원 리스트 조회 기능
	public static final int MENU_MEMBER_VIEW = 2;   //회원 정보 조회 기능
	public static final int MENU_MEMBER_REG = 3;    //회원 등록 기능
	public static final int MENU_MEMBER_MOD = 4;    //회원 정보 수정 기능
	public static final int MENU_MEMBER_DEL = 5;    //회원 정보 삭제 기능
	
	public static final int MENU_CAR_LIST = 1;		//렌터카 리스트 조회 
	public static final int MENU_CAR_VIEW = 2; 		//렌터카 정보 조회 기능
	public static final int MENU_CAR_REG = 3;		//렌터카 정보 등록 기능
	public static final int MENU_CAR_MOD = 4;		//렌터카 정보 수정 기능
	public static final int MENU_CAR_DEL = 5;		//렌터카 정보 삭제 기능
	
	public static final int MENU_RES_LIST = 1;		//예약 리스트 조회 기능
	public static final int MENU_RES_VIEW = 2;		//예약 정보 조회 기능
	public static final int MENU_RES_REG = 3;		//예약 정보 등록 기능
	public static final int MENU_RES_MOD = 4;		//예약 정보 수정 기능
	public static final int MENU_RES_DEL = 5;		//예약 정보 삭제 기능
	
	
	public static List<CarVO> carList;  //리스트로 렌터카 정보 저장, 예약 기능에서도 사용할 수 있도록 부모 클래스에 선언
	
	// 하위 클래스의 결과값을 출력하는 메소드
	public void displayData(List<? extends Object> listData) {
		if(listData == null  || listData.size() == 0) {
			System.out.println("\n조회한 데이터가 없습니다.");
		} else {
			Object obj = listData.get(0);
			if (obj instanceof MemberVO) {
				System.out.println("\n회원 리스트");
				System.out.println("---------------------------------------------------------------------------");
				for (int i = 0; i < listData.size(); i++) {
					obj = listData.get(i);
					MemberVO memberVO = (MemberVO) obj;
					String id = memberVO.getId();
					String password = memberVO.getPassword();
					String name = memberVO.getName();
					String address = memberVO.getAddress();
					String phoneNum = memberVO.getPhoneNum();
					System.out.println("아이디: " + id +
							            ", 비밀번호: " + password+
							            ", 이름: " + name +
							            ", 주소: " + address +
							            ", 전화번호: " + phoneNum);
					
				}
			}else if(obj instanceof CarVO) {
				System.out.println("\n렌터카 리스트");
				System.out.println("---------------------------------------------------------------------------");
				for (int i = 0; i < listData.size(); i++) {
					obj = listData.get(i);
					CarVO carVO = (CarVO)obj;
					String carNumber = carVO.getCarNumber();
					String carName = carVO.getCarName();
					String carColor = carVO.getCarColor();
					int carSize = carVO.getCarSize();
					String carMaker = carVO.getCarMaker();
					
					System.out.println("차번호: " + carNumber +
							            ", 차이름: " + carName +
							            ", 차색상: " + carColor +
							            ", 배기량: " + carSize + "cc" + 
							            ", 제조사: " + carMaker);
					
				}	
				
			}else if(obj instanceof ResVO) {
				System.out.println("\n렌터카 예약 리스트");
				System.out.println("---------------------------------------------------------------------------");
				for (int i = 0; i < listData.size(); i++) {
					obj = listData.get(i);
					ResVO resVO = (ResVO)obj;
					String resNumber = resVO.getResNumber();
					String resCarNumber = resVO.getResCarNumber();
					String resDate = resVO.getResDate();
					String useBeginDate= resVO.getUseBeginDate();
					String returnDate = resVO.getReturnDate();
					
					System.out.println("예약 번호: " + resNumber +
										", 예약일자: " + resDate +            
										", 예약 차번호: " + resCarNumber +
							            ", 렌터카 이용 시작일: " + useBeginDate + 
							            ", 렌터카 반납일: " + returnDate);
					
				}	
				
			}
			
		}
		
	}
	
	public void displayData(Object  obj) {
		System.out.println("\n조회 결과");
		System.out.println("-----------------------------------------------------------------------");

		if(obj instanceof MemberVO) {
			MemberVO memberVO = (MemberVO)obj;
			String id = memberVO.getId();
			String password = memberVO.getPassword();
			String name =memberVO.getName();
			String address = memberVO.getAddress();
			String phoneNum = memberVO.getPhoneNum();
			System.out.println("아이디: " + id +
					            ", 비밀번호: " + password+
					            ", 이름: " + name +
					            ", 주소: " + address +
					            ",  전화번호: " + phoneNum);
		
		}else if(obj instanceof CarVO) {
			CarVO carVO = (CarVO)obj;
			String carNumber = carVO.getCarNumber();
			String carName = carVO.getCarName();
			String carColor = carVO.getCarColor();
			int carSize = carVO.getCarSize();
			String carMaker = carVO.getCarMaker();
			
			System.out.println("차번호: " + carNumber +
					            ", 차이름: " + carName +
					            ", 차색상: " + carColor +
					            ", 배기량: " + carSize + "cc" + 
					            ", 제조사: " + carMaker);
		
		}else if(obj instanceof ResVO) {
			ResVO resVO = (ResVO)obj;
			String resNumber = resVO.getResNumber();
			String resCarNumber = resVO.getResCarNumber();
			String resDate = resVO.getResDate();
			String useBeginDate= resVO.getUseBeginDate();
			String returnDate = resVO.getReturnDate();
			
			System.out.println("예약 번호: " + resNumber +
								", 예약일자: " + resDate +            
								", 예약 차번호: " + resCarNumber +
					            ", 렌터카 이용 시작일: " + useBeginDate + 
					            ", 렌터카 반납일: " + returnDate);
		}else {
			System.out.println("요청한 정보가 존재하지 않습니다.");
		}
		
	}
	
	public void displayData(String data) {
		System.out.println("조회한 데이터는 " + data + " 입니다."  + "\n");
	}

	// 조회한 데이터의 시간 정보를 제공하는 메소드
	public String showTime() {
		String date = null;
		String time = null;

		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);

		date = year + "-" + month + "-" + day;
		time = hour + ":" + min + ":" + sec;
		return date + " " + time;
	}
	
	//예약 하기 전 예약할 렌터카를 조회하는 기능입니다.
	public static void listCarData() {
			System.out.println("\n렌터카 리스트");
			System.out.println("------------------------------------------");
			for (int i = 0; i < carList.size(); i++) {
				CarVO carVO = carList.get(i);
				String carNumber = carVO.getCarNumber();
				String carName = carVO.getCarName();
				String carColor = carVO.getCarColor();
				int carSize = carVO.getCarSize();
				String carMaker = carVO.getCarMaker();
				
				System.out.println("차번호 : " + carNumber +
						            ", 차이름 : " + carName +
						            ", 차색상 : " + carColor +
						            ", 배기량 : " + carSize + "cc" + 
						            ", 제조사 : " + carMaker);
			}	
	}

}
