package com.oracle.rent.ch23.res.vo;

public class ResVO {
	private String resNumber;  //예약 번호
	private String resCarNumber;  //예약 차번호
	private String resDate;         //예약 일자
	private String useBeginDate;    //사용시작 일자
	private String returnDate;       //반납일자
	private String resUserId;  //예약자 아이디

	//생성자
	public ResVO() {}
	public ResVO(String resNumber, String resCarNumber, String resDate, String useBeginDate, String returnDate, String resUserId) {
		this.resNumber = resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.returnDate = returnDate;
		this.resUserId = resUserId;
	}
	
	
	public String getResNumber() {
		return resNumber;
	}
	public void setResNumber(String resNumber) {
		this.resNumber = resNumber;
	}
	public String getResCarNumber() {
		return resCarNumber;
	}
	public void setResCarNumber(String resCarNumber) {
		this.resCarNumber = resCarNumber;
	}
	public String getResDate() {
		return resDate;
	}
	public void setResDate(String resDate) {
		this.resDate = resDate;
	}
	public String getUseBeginDate() {
		return useBeginDate;
	}
	public void setUseBeginDate(String useBeginDate) {
		this.useBeginDate = useBeginDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getResUserId() {
		return resUserId;
	}
	public void setResUserId(String resUserId) {
		this.resUserId = resUserId;
	}

	
	

}
