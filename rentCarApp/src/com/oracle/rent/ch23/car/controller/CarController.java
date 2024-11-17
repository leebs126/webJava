package com.oracle.rent.ch23.car.controller;

import java.io.IOException;
import java.util.List;

import com.oracle.rent.ch23.car.exception.CarException;
import com.oracle.rent.ch23.car.vo.CarVO;

public interface CarController {
	public List<CarVO> listCarInfo(CarVO carVO) ;  //렌터카 리스트 출력 

	public void regCarInfo(CarVO carVO) ;          //렌터카 추가
		
	public void modCarInfo(CarVO carVO) ;          //렌터카 수정
	
	public void removeCarInfo(CarVO carVO) ;		//렌터카 삭제

}
