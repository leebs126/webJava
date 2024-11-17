package com.oracle.rent.ch23.car.dao;

import java.sql.SQLException;
import java.util.List;

import com.oracle.rent.ch23.car.vo.CarVO;


public interface CarDAO {
	public List<CarVO> selectCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException;   //렌터카 리스트 출력
	
	public void insertCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException;           //렌터카 추가
	
	public void updateCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException;            //렌터카 수정
	
	public void deleteCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException;            //렌터카 삭제
}
