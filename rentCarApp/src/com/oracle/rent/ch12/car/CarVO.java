package com.oracle.rent.ch12.car;

public class CarVO {
	String carNumber; // 차번호
	String carName; // 차이름
	String carColor; // 차색상
	int carSize; // 차크기
	String carMaker; // 제조사

	public CarVO(String carNumber, String carName, String carColor, int carSize, String carMaker) {
		this.carNumber = carNumber;
		this.carName = carName;
		this.carColor = carColor;
		this.carSize = carSize;
		this.carMaker = carMaker;
	}

}
