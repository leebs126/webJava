package sec01.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@119.194.27.49:1521:XE";
	private static final String user = "C##user1";
	private static final String pwd = "1234";


	
	public static void main(String[] args)  {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			
			stmt = conn.createStatement();
			System.out.println("Statement 생성 성공");
			
			String query = "INSERT INTO Member (id, name, height, weight, age) VALUES ( '0003','차범근' , 185, 85 ,23)";
			System.out.println(query);
			int rows = stmt.executeUpdate(query);
			System.out.println(rows+"개의 행 추가");
	
//			String query2 = "SELECT * FROM Member ORDER BY id";
			String query2 = "SELECT id, name, height, weight, age FROM Member ORDER BY id";
			System.out.println(query2);
			System.out.println();
			
			rs = stmt.executeQuery(query2);
			while (rs.next()) {
				System.out.print("아이디: " + rs.getString("id"));
				System.out.print(", 이름: " + rs.getString("name"));
				System.out.print(", 키: " + rs.getInt("height"));
				System.out.print(", 체중: " + rs.getInt("weight"));
				System.out.print(", 나이: " + rs.getInt("age"));
				System.out.println();
				
//				System.out.print("아이디: " + rs.getString(1));
//				System.out.print(", 이름: " + rs.getString(2));
//				System.out.print(", 키: " + rs.getInt(3));
//				System.out.print(", 체중: " + rs.getInt(4));
//				System.out.print(", 나이: " + rs.getInt(5));
//				System.out.println();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
			}
		}

	} // end main
}