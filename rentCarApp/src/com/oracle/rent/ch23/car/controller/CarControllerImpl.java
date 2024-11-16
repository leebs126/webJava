package com.oracle.rent.ch23.car.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch23.car.dao.CarDAO;
import com.oracle.rent.ch23.car.dao.CarDAOImpl;
import com.oracle.rent.ch23.car.vo.CarVO;
import com.oracle.rent.ch23.common.base.AbstractBaseController;
import com.oracle.rent.ch23.member.vo.MemberVO;



public class CarControllerImpl extends AbstractBaseController implements CarController{
	public CarDAO carDAO;
	
	public CarControllerImpl() {
		carDAO = new CarDAOImpl();
	}
	
	
	@Override
	public List<CarVO> listCarInfo(CarVO carVO) {
		List<CarVO> carList = new ArrayList<CarVO>();
		try {
			carList = carDAO.selectCarInfo(carVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return carList;
	}

	

	@Override
	public void regCarInfo(CarVO carVO)  {
		try {
			carDAO.insertCarInfo(carVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void modCarInfo(CarVO carVO)  {
		try {
			carDAO.updateCarInfo(carVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeCarInfo(CarVO carVO) {
		try {
			carDAO.deleteCarInfo(carVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	

	

}
