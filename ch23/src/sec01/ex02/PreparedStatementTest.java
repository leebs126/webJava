package sec01.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@119.194.27.49:1521:XE";
	private static final String user = "C##user1";
	private static final String pwd = "1234";

	public static void main(String[] args)  {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
			
			pstmt = conn.prepareStatement("INSERT INTO Member (id, name, height, weight, age)   VALUES (?, ?, ?, ?, ?)");
			System.out.println("PreparedStatement 생성 성공");
			
			pstmt.setString(1, "0004");
			pstmt.setString(2, "박지성");
			pstmt.setInt(3, 178);
			pstmt.setInt(4, 67);
			pstmt.setInt(5, 23);
			int rows = pstmt.executeUpdate();
			
			pstmt.setString(1, "0005");
			pstmt.setString(2, "류현진");
			pstmt.setInt(3, 167);
			pstmt.setInt(4, 45);
			pstmt.setInt(5, 18);
			pstmt.executeUpdate();
	
			pstmt = conn.prepareStatement("SELECT id, name, height, weight, age FROM Member");
	//		pstmt = conn.prepareStatement("SELECT  id, name, height, weight, age FROM member WHERE name = ?");
	//		pstmt.setString(1, "홍길동");
	
			rs = pstmt.executeQuery();
			System.out.println();
			
			while (rs.next()) {
				System.out.print("아이디: " + rs.getString("id"));
				System.out.print(", 이름: " + rs.getString("name"));
				System.out.print(", 키: " + rs.getInt("height"));
				System.out.print(", 체중: " + rs.getInt("weight"));
				System.out.print(", 나이: " + rs.getInt("age"));
				System.out.println();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {}
		}

	}

}
