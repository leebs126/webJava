package com.oracle.rent.ch19.common;

public class DataUtil {
	//인스턴스 생성을 금지합니다.
	private  DataUtil() {
		
	}
		

	public static void encodeData(String data) {
		System.out.println("\n" +data + "를 암호화합니다.");
	}

	public static void decodeData(String data) {
		System.out.println("\n" + data + "를 복호화합니다.");
	}

}
