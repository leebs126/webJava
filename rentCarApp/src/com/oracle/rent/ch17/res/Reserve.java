package com.oracle.rent.ch17.res;

import java.util.List;

public interface Reserve {
	public List<ResVO>  listResInfo() throws ResException;   //예약 리스트 조회
	
	public ResVO  checkResInfo(ResVO resVO) throws ResException;
	
	public void regResInfo(ResVO resVO) throws ResException;
	
	public void modResInfo(ResVO resVO) throws ResException;
	
	public void cancelResInfo(ResVO resVO) throws ResException;
	

}
