package com.oracle.rent.ch08.res;

public class Reserve {
	//필드
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String useEndDate;
	
	//생성자
	public Reserve() {

	}

	public Reserve(String _resCarNumber, String _resDate, String _useBeginDate, String _useEndDate) {
		resCarNumber = _resCarNumber;
		resDate = _resDate;
		useBeginDate = _useBeginDate;
		useEndDate = _useEndDate;
	}
	
	//차 예약 정보 조회 기능
	public String checkResInfo() {
		System.out.println("\n차 예약 정보를 조회합니다.");
		System.out.println("-------------------------");
		String resInfo = "예약차 번호 : " + resCarNumber
						+"\n예약일자 : " + resDate
						+"\n차사용시작일자 : " + useBeginDate
						+"\n차반납예정일자 : " + useEndDate; 
		return resInfo;
	}
	
	//차 예약 기능
	public void resCar(String _resCarNumber, String _resDate, String _useBeginDate, String _useEndDate) {
		System.out.println("차 예약 정보를 등록합니다.");
		resCarNumber = _resCarNumber;
		resDate = _resDate;
		useBeginDate = _useBeginDate;
		useEndDate = _useEndDate;
	}

	// 차 예약정보 수정 기능
	public void modResInfo() {
		System.out.println("\n차 예약정보를 수정합니다..");
	}

	// 차 예약 정보 취소 기능
	public void cancelResInfo() {
		System.out.println("\n차 예약을 취소합니다.");
	}


}
