package sec04.ex02.dao;

import java.sql.SQLException;
import java.util.List;

import sec04.ex02.vo.ProdVO;

public interface ProdDAO {
	public List<ProdVO> selectProd(ProdVO prodVO) throws SQLException, ClassNotFoundException;
	
	public void insertProd(ProdVO prodVO) throws SQLException, ClassNotFoundException;
	
	public void updateProd(ProdVO prodVO) throws SQLException, ClassNotFoundException;
	
	public void deleteProd(ProdVO prodVO) throws SQLException, ClassNotFoundException;
	

}
