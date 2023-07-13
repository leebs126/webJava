package com.oracle.rent.ch13.car;

public interface Car {
	public String checkCarInfo(CarVO vo);
	
	public void regCarInfo(CarVO vo);
	
	public void modCarInfo(CarVO vo);
	
	public void delCarInfo(CarVO vo);

}
