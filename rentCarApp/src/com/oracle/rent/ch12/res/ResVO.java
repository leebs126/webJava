package com.oracle.rent.ch12.res;

public class ResVO {
	String resNumber; // 예약번호
	String resCarNumber; // 예약차번호
	String resDate; // 예약일자
	String useBeginDate; // 레터카 사용시작일자
	String returnDate; // 렌터카 반납일자

	public ResVO(String _resNumber, String resCarNumber, String resDate, String useBeginDate, String returnDate) {
		this.resNumber = _resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.returnDate = returnDate;
	}

}
