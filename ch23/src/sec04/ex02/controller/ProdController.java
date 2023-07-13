package sec04.ex02.controller;

import java.util.List;

import sec04.ex02.vo.ProdVO;

public interface ProdController {
	public List<ProdVO> listProd(ProdVO prodVO);
	
	public void addProd(ProdVO prodVO);
	
	public void modProd(ProdVO prodVO);
	
	public void removeProd(ProdVO prodVO);	

}
