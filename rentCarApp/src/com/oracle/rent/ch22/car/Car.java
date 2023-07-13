package com.oracle.rent.ch22.car;

import java.io.IOException;
import java.util.List;

public interface Car {
	public List<CarVO> listCarInfo() throws CarException, IOException;  //렌터카 리스트 출력 
	
	public CarVO checkCarInfo(CarVO carVO) throws CarException, IOException;
	
	public void regCarInfo(CarVO carVO) throws CarException, IOException; 
	
	public void modCarInfo(CarVO carVO) throws CarException, IOException;
	
	public void delCarInfo(CarVO carVO) throws CarException, IOException;

}
