package com.oracle.rent.ch17.car;

import java.util.List;

public interface Car {
	public List<CarVO> listCarInfo() throws CarException;  //렌터카 리스트 출력 
	
	public CarVO checkCarInfo(CarVO carVO) throws CarException;
	
	public void regCarInfo(CarVO carVO) throws CarException; 
	
	public void modCarInfo(CarVO carVO) throws CarException;
	
	public void delCarInfo(CarVO carVO) throws CarException;

}
