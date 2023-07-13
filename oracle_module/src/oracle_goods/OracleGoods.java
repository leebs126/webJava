package oracle_goods;

import oracle_common.OracleDriver;

public class OracleGoods {
	public void listGoods() {
		OracleDriver driver = new OracleDriver();
		driver.connect();
		System.out.println("Oracle 데이터베이스에서 상품 정보를 조회합니다.");
	}
	

}
