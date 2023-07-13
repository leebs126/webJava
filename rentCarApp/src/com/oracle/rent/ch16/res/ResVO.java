package com.oracle.rent.ch16.res;

public class ResVO {
	String resNumber;
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String returnDate;

	public ResVO(String resNumber, String resCarNumber, String resDate, String useBeginDate, String returnDate) {
		this.resNumber = resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.returnDate = returnDate;
	}

}
