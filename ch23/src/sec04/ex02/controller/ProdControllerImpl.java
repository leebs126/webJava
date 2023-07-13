package sec04.ex02.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sec03.ex01.vo.MemberVO;
import sec04.ex02.dao.ProdDAOImpl;
import sec04.ex02.vo.ProdVO;


public class ProdControllerImpl implements ProdController {
	public ProdDAOImpl prodDAO;
	
	
	public ProdControllerImpl() {
		prodDAO = new ProdDAOImpl();
	}

	@Override
	public List<ProdVO> listProd(ProdVO prodVO) {
		List<ProdVO> prodList = new ArrayList<ProdVO>();
		try {
			prodList = prodDAO.selectProd(prodVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return prodList;
	}

	@Override
	public void addProd(ProdVO prodVO) {
		try {
			prodDAO.insertProd(prodVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void modProd(ProdVO prodVO) {
		try {
			prodDAO.updateProd(prodVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeProd(ProdVO prodVO) {
		try {
			prodDAO.deleteProd(prodVO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
