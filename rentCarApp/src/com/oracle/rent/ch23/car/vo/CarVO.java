package com.oracle.rent.ch23.car.vo;

public class CarVO {
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carMaker;
	
	public CarVO() {}

	public CarVO(String carNumber, String carName, String carColor, int carSize, String carMaker) {
		this.carNumber = carNumber;
		this.carName = carName;
		this.carColor = carColor;
		this.carSize = carSize;
		this.carMaker = carMaker;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getCarSize() {
		return carSize;
	}

	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}

	public String getCarMaker() {
		return carMaker;
	}

	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}
	
	

}
