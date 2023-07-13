package mysql_goods;

import mysql_common.MySqlDriver;

public class MySqlGoods {
	
	public void listGoods() {
		MySqlDriver driver = new MySqlDriver();
		driver.connect();
		System.out.println("mySql 데이터베이스에서 상품 정보를 조회합니다.");
	}

}
