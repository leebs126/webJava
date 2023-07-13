package main;

import mysql_goods.MySqlGoods;
import oracle_goods.OracleGoods;

public class AppMain {

	public static void main(String[] args) {
		OracleGoods oracleGoods = new OracleGoods();
		oracleGoods.listGoods();
		System.out.println();
		
		MySqlGoods mySqlGoods = new MySqlGoods();
		mySqlGoods.listGoods();

	}

}
