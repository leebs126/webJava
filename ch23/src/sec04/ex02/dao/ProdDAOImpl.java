package sec04.ex02.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sec03.ex01.vo.MemberVO;
import sec04.ex02.vo.ProdVO;

public class ProdDAOImpl  implements ProdDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "C##user1";
	private static final String pwd = "1234";

	private static Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public ProdDAOImpl() {
		try {
			connDB();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ProdVO> selectProd(ProdVO prodVO) throws SQLException, ClassNotFoundException {
		List<ProdVO> prodList = new ArrayList<ProdVO>();
		String _prodName = prodVO.getProdName();
		if(_prodName != null && _prodName.length() != 0) {
			pstmt = con.prepareStatement("SELECT * FROM Product  WHERE prodName = ? ORDER BY prodCode");
			pstmt.setString(1, _prodName);
			
		}else {
			pstmt = con.prepareStatement("SELECT * FROM Product ORDER BY prodCode");
		}
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			String prodCode = rs.getString("prodCode");
			String prodName = rs.getString("prodName");
			String prodColor = rs.getString("prodColor");
			int prodQty = rs.getInt("prodQty");

			ProdVO _prodVO = new ProdVO();
			_prodVO.setProdCode(prodCode);
			_prodVO.setProdName(prodName);
			_prodVO.setProdColor(prodColor);
			_prodVO.setProdQty(prodQty);

			prodList.add(_prodVO);
		} // end while
		rs.close();
		return prodList;
	} // end list()

	@Override
	public void insertProd(ProdVO prodVO) throws SQLException, ClassNotFoundException {
		pstmt = con.prepareStatement("INSERT INTO Product (prodCode, prodName, prodColor, prodQty) VALUES (?, ?, ?, ?)");
		pstmt.setString(1, prodVO.getProdCode());
		pstmt.setString(2, prodVO.getProdName());
		pstmt.setString(3, prodVO.getProdColor());
		pstmt.setInt(4, prodVO.getProdQty());
		pstmt.executeUpdate();
	} // end insertMember()

	
	// 회원 정보 수정 메소드
	@Override
	public void updateProd(ProdVO prodVO) throws SQLException, ClassNotFoundException {
		pstmt = con.prepareStatement("UPDATE Product SET  prodName = ?"
				                                        + ", prodColor = ?"
				                                        + ", prodQty = ? "
				                                      +   " WHERE prodCode = ?");
		pstmt.setString(1, prodVO.getProdName());
		pstmt.setString(2, prodVO.getProdColor());
		pstmt.setInt(3, prodVO.getProdQty());
		pstmt.setString(4, prodVO.getProdCode());
		pstmt.executeUpdate();

	}

	// 회원 정보 삭제 메소드
	@Override
	public void deleteProd(ProdVO prodVO) throws SQLException, ClassNotFoundException {
		pstmt = con.prepareStatement("DELETE Product WHERE prodCode = ?");
		pstmt.setString(1, prodVO.getProdCode());
		pstmt.executeUpdate();


	}
	

	
	private void connDB() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
//		System.out.println("Oracle 드라이버 로딩 성공");
		con = DriverManager.getConnection(url, user, pwd);
//		System.out.println("Connection 생성 성공");

	}

}
