package com.oracle.rent.ch23.res.controller;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch23.common.base.AbstractBaseController;
import com.oracle.rent.ch23.res.dao.ResDAO;
import com.oracle.rent.ch23.res.dao.ResDAOImpl;
import com.oracle.rent.ch23.res.vo.ResVO;

public class ResControllerImpl extends AbstractBaseController implements ResController{
	private ResDAO resDAO;
	
	public ResControllerImpl() {
		resDAO = new ResDAOImpl();
		
	}
	@Override
	public List<ResVO> listResInfo(ResVO resVO) {
		List<ResVO> resList = new ArrayList<ResVO>();
		try {
			resList = resDAO.selectResInfo(resVO);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return resList;
		
	}

	@Override
	public void regResInfo(ResVO resVO)  {
		try {
			resDAO.insertResInfo(resVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void modResInfo(ResVO resVO)  {
		try {
			resDAO.updateResInfo(resVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();			
		}
	}

	@Override
	public void cancelResInfo(ResVO resVO)  {
		try {
			resDAO.deleteResInfo(resVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
