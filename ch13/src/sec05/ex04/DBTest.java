package sec05.ex04;

public class DBTest {
	
	public static void DAO(DBDriver driver) {
		driver.connect();
		driver.login();
		driver.register();
		driver.search();
		driver.close();
	}

	public static void main(String[] args) {
		
		DAO(new OracleDriver());
		System.out.println();
		DAO(new MySQLDriver());
		

	}

}
