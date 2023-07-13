package main;

import mysql.MySqlDriver;
import oracle.OracleDriver;

public class AppMain {
	public static void main(String[] args) {
		OracleDriver driver1 = new OracleDriver();
		driver1.connect();
		System.out.println();
		
		MySqlDriver driver2 = new MySqlDriver();
		driver2.connect();
	}
}
