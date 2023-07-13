package com.oracle.rent.ch13.res;

public interface Reserve {
	public String  checkResInfo(ResVO vo);
	
	public void resCar(ResVO vo);
	
	public void modResInfo(ResVO vo);
	
	public void cancelResInfo(ResVO vo);
	

}
