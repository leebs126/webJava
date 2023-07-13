package com.oracle.rent.ch16.res;


public interface Reserve {
	public String  checkResInfo(ResVO resVO) throws ResException;
	
	public void resCar(ResVO resVO) throws ResException;
	
	public void modResInfo(ResVO resVO) throws ResException;
	
	public void cancelResInfo(ResVO resVO) throws ResException;
	

}
