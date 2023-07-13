package sec05.ex01;

import java.util.Enumeration;
import java.util.Properties;

public class MysqlDriverTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("driver", "com.mysql.jdbc.Driver");
		prop.setProperty("url", "jdbc:mysql://localhost/user_db?&useSSL=false");
		prop.setProperty("username", "user01");
		prop.setProperty("password", "p@ssw0rd");

		

		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println();
		System.out.println("MySql 연결정보");
		System.out.println("----------------------------------");
		System.out.println("driver  = " + driver);
		System.out.println("url = " + url);
		System.out.println("username = " + username);
		System.out.println("password = " + password);
		
	}

}
