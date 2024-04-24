package com.oracle.rent.ch09.res;

import com.oracle.rent.ch09.common.Base;

public class Reserve extends Base{
	private String resNumber;
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String useEndDate;
	
	public Reserve() {
		
	}
	
	
	public Reserve(String resNumber, String resCarNumber, String resDate, String useBeginDate, String useEndDate) {
		this.resNumber = resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.useEndDate = useEndDate;
	}





	// 차 예약 정보 조회 기능 
	public String  checkResInfo() {
		System.out.println("\n차 예약 정보를 조회합니다.");
	      System.out.println("렌트카 정보 조회 시간 :"+showTime());   
		System.out.println("-------------------------");
		String resInfo ="예약 번호: " + resNumber 
				        + "\n예약차 번호: " + resCarNumber
				        + "\n예약일자: " + resDate
				        + "\n차사용시작일자: " + useBeginDate
				        + "차반납예정일자: " + useEndDate; 
		return resInfo;
	}
	
	// 차 예약 기능
	public void resCar(String resNumber, String resCarNumber, String resDate, String useBeginDate, String useEndDate) {
		System.out.println("\n렌터카를 예약합니다.");
	    System.out.println("렌트카 예약 시간 :"+showTime());
	    this.resNumber = resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.useEndDate = useEndDate;
	}

	// 차 예약정보 수정 기능
	public void modResInfo() {
		System.out.println("\n차 예약정보를 수정합니다.");
		System.out.println("렌트카 예약정보 수정시간 :" + showTime());
	}

	// 차 예약 정보 취소 기능
	public void cancelResInfo() {
		System.out.println("\n차 예약을 취소합니다.");
		System.out.println("렌트카 예약정보 삭제 시간 :"+showTime());
	}

}
