package sec02.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "C##user1";
	private static final String pwd = "1234";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public MemberDAO() {
			connDB();
	}

	public List<MemberVO> selectMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		String _name = memVO.getName();
		List<MemberVO> memList = new ArrayList<MemberVO>();
		String query = "SELECT * FROM member  ";
		if(_name != null && _name.length() != 0) {
			query+=" where name = ? ORDER BY id ASC";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, _name);
			
		}else {
			query += " ORDER BY id ";
			pstmt = conn.prepareStatement(query);
		}
		System.out.println(query);
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			int height = rs.getInt("height");
			int weight = rs.getInt("weight");
			int age = rs.getInt("age");

			MemberVO memberVO = new MemberVO();
			memberVO.setId(id);
			memberVO.setName(name);
			memberVO.setHeight(height);
			memberVO.setWeight(weight);
			memberVO.setAge(age);
			memList.add(memberVO);
		} // end while

		return memList;
	} // end listMember()



	public void insertMember(MemberVO memberVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("INSERT INTO member (id, name, height, weight, age) VALUES ( ?,?,?,?,? )");
		pstmt.setString(1, memberVO.getId());
		pstmt.setString(2, memberVO.getName());
		pstmt.setInt(3, memberVO.getHeight());
		pstmt.setInt(4, memberVO.getWeight());
		pstmt.setInt(5, memberVO.getAge());
		pstmt.executeUpdate();
	} // end insertMember()

	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("Connection 생성 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		}
	}

}
