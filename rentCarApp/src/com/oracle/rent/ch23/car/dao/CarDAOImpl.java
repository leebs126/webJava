package com.oracle.rent.ch23.car.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.rent.ch23.car.vo.CarVO;
import com.oracle.rent.ch23.common.base.AbstractBaseDAO;

public class CarDAOImpl extends AbstractBaseDAO implements CarDAO {

	@Override
	public List<CarVO> selectCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException {
		List<CarVO> carList = new ArrayList<CarVO>();
		String _carNumber = carVO.getCarNumber();
		if(_carNumber != null && _carNumber.length() != 0) {
			pstmt = conn.prepareStatement("SELECT * FROM t_Car  WHERE carNumber = ? ORDER BY carNumber");
			pstmt.setString(1, _carNumber);
			
		}else {
			pstmt = conn.prepareStatement("SELECT * FROM t_Car ORDER BY carNumber");
		}
		
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			String carNumber = rs.getString("carNumber");
			String carName = rs.getString("carName");
			String carColor = rs.getString("carColor");
			int carSize = rs.getInt("carSize");
			String carMaker = rs.getString("carMaker");
			CarVO _carVO = new CarVO();
			
			_carVO.setCarNumber(carNumber);
			_carVO.setCarName(carName);
			_carVO.setCarColor(carColor);
			_carVO.setCarSize(carSize);
			_carVO.setCarMaker(carMaker);
			carList.add(_carVO);
		} // end while
		
		rs.close();
		return carList;
	}

	@Override
	public void insertCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("INSERT INTO t_Car (carNumber, carName, carColor, carSize, carMaker) VALUES (?, ?, ?, ?, ?)");
		pstmt.setString(1, carVO.getCarNumber());
		pstmt.setString(2, carVO.getCarName());
		pstmt.setString(3, carVO.getCarColor());
		pstmt.setInt(4, carVO.getCarSize());
		pstmt.setString(5, carVO.getCarMaker());
		
		pstmt.executeUpdate();
	}

	@Override
	public void updateCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("UPDATE t_Car SET  carName = ?, carColor = ?, carSize = ?, carMaker = ? WHERE carNumber = ?");
		pstmt.setString(1, carVO.getCarName());
		pstmt.setString(2, carVO.getCarColor());
		pstmt.setInt(3, carVO.getCarSize());
		pstmt.setString(4, carVO.getCarMaker());
		pstmt.setString(5, carVO.getCarNumber());
		
		pstmt.executeUpdate();

		
	}

	@Override
	public void deleteCarInfo(CarVO carVO) throws SQLException, ClassNotFoundException {
		pstmt = conn.prepareStatement("DELETE t_Car WHERE carNumber = ?");
		pstmt.setString(1, carVO.getCarNumber());
		pstmt.executeUpdate();
		
	}

}
