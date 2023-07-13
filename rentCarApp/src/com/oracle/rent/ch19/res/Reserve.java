package com.oracle.rent.ch19.res;

import java.io.IOException;
import java.util.List;

public interface Reserve {
	public List<ResVO>  listResInfo() throws ResException, IOException;   //예약 리스트 조회
	
	public ResVO  checkResInfo(ResVO resVO) throws ResException, IOException;
	
	public void regResInfo(ResVO resVO) throws ResException, IOException;
	
	public void modResInfo(ResVO resVO) throws ResException, IOException;
	
	public void cancelResInfo(ResVO resVO) throws ResException, IOException;
	

}
