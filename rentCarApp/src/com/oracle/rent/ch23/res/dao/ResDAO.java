package com.oracle.rent.ch23.res.dao;

import java.sql.SQLException;
import java.util.List;

import com.oracle.rent.ch23.res.vo.ResVO;


public interface ResDAO {
	public List<ResVO> selectResInfo(ResVO resVO) throws SQLException, ClassNotFoundException;  //예약 리스트 출력 

	public void insertResInfo(ResVO resVO) throws SQLException, ClassNotFoundException;
	
	public void updateResInfo(ResVO resVO) throws SQLException, ClassNotFoundException;
	
	public void deleteResInfo(ResVO resVO) throws SQLException, ClassNotFoundException;

}
