package sec03.ex01.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sec03.ex01.vo.MemberVO;


public class MemberDAOImpl implements MemberDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver"; 
	private static final String url = "jdbc:oracle:thin:@119.194.27.49:1521:XE";
	private static final String user = "C##user1";
	private static final String pwd = "1234";

	private static Connection conn; // DB연결에 사용되는 객체를 선언한다.
	private PreparedStatement pstmt;
	private ResultSet rs;

	public MemberDAOImpl() {
		connDB();
	}

	public List<MemberVO> selectMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		List<MemberVO> memList = new ArrayList<MemberVO>();
		String _name = memVO.getName();
		if(_name != null && _name.length() != 0) {
			pstmt = conn.prepareStatement("SELECT * FROM Member  WHERE name = ? ORDER BY id");
			pstmt.setString(1, _name);
			
		}else {
			pstmt = conn.prepareStatement("SELECT * FROM Member ORDER BY id");
		}
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			int height = rs.getInt("height");
			int weight = rs.getInt("weight");
			int age = rs.getInt("age");

			MemberVO _memVO = new MemberVO();
			_memVO.setId(id);
			_memVO.setName(name);
			_memVO.setHeight(height);
			_memVO.setWeight(weight);
			_memVO.setAge(age);

			memList.add(_memVO);
		} // end while
		rs.close();
		return memList;
	} // end list()

	public void insertMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("INSERT INTO member (id, name, height, weight, age) VALUES ( ?,?,?,?,? )");
		pstmt.setString(1, memVO.getId());
		pstmt.setString(2, memVO.getName());
		pstmt.setInt(3, memVO.getHeight());
		pstmt.setInt(4, memVO.getWeight());
		pstmt.setInt(5, memVO.getAge());
		int rows = pstmt.executeUpdate();
		System.out.println(rows+"개의 레코드 추가");
	} // end insertMember()

	// 회원 정보 수정 메소드
	public void updateMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("UPDATE member SET  name = ?"
				                                      + ", height = ?"
				                                      + ", weight = ? "
				                                      + ", age = ? "
				                                      + "WHERE id = ?");
		pstmt.setString(1, memVO.getName());
		pstmt.setInt(2, memVO.getHeight());
		pstmt.setInt(3, memVO.getWeight());
		pstmt.setInt(4, memVO.getAge());
		pstmt.setString(5, memVO.getId());
		int rows = pstmt.executeUpdate();
		System.out.println(rows +"개의 레코드 수정");

	}

	// 회원 정보 삭제 메소드
	public void deleteMember(MemberVO memVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("DELETE member WHERE id = ?");
		pstmt.setString(1, memVO.getId());
		int rows = pstmt.executeUpdate();
		System.out.println(rows+"개의 레코드 삭제");


	}

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
			} catch (SQLException e1) {}
		}
	}
}// end class MemberDAOImpl
