package com.oracle.rent.ch12.res;

public class ResVO {
	String resNumber;
	String resCarNumber;
	String resDate;
	String useBeginDate;
	String returnDate;

	public ResVO(String _resNumber, String resCarNumber, String resDate, String useBeginDate, String returnDate) {
		this.resNumber = _resNumber;
		this.resCarNumber = resCarNumber;
		this.resDate = resDate;
		this.useBeginDate = useBeginDate;
		this.returnDate = returnDate;
	}

}
