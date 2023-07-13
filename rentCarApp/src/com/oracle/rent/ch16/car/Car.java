package com.oracle.rent.ch16.car;


public interface Car {
	public String checkCarInfo(CarVO carVO) throws CarException;
	
	public void regCarInfo(CarVO carVO) throws CarException; 
	
	public void modCarInfo(CarVO carVO) throws CarException;
	
	public void delCarInfo(CarVO carVO) throws CarException;

}
