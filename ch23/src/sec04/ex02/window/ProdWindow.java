package sec04.ex02.window;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import sec03.ex01.vo.MemberVO;
import sec04.ex02.vo.ProdVO;

public class ProdWindow extends BaseWindow {
	public ProdWindow() {
		System.out.println("생성자 호출");

		frame = new JFrame("제품 관리창");
		lProdCode = new JLabel("제품번호", Label.RIGHT);
		lProdName = new JLabel("제품이름", Label.RIGHT);
		lProdColor = new JLabel("제품색상", Label.RIGHT);
		lProdQty = new JLabel("제품수량", Label.RIGHT);

		lProdCode.setHorizontalAlignment(JLabel.CENTER);
		lProdName.setHorizontalAlignment(JLabel.CENTER);
		lProdColor.setHorizontalAlignment(JLabel.CENTER);
		lProdQty.setHorizontalAlignment(JLabel.CENTER);

		tProdCode = new JTextField();
		tProdName= new JTextField();
		tProdColor = new JTextField();
		tProdQty = new JTextField();

		btnSearch = new JButton("조회");
		btnInsert = new JButton("추가");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");

	}

	// 제품 관리 화면을 구성한다.
	public void createGUI() {
		part1 = new JPanel();
		part1.setLayout(new GridLayout(1, 0));
		part1.add(lProdCode);
		part1.add(tProdCode);

		part2 = new JPanel();
		part2.setLayout(new GridLayout(1, 0));
		part2.add(lProdName);
		part2.add(tProdName);

		part3 = new JPanel();
		part3.setLayout(new GridLayout(1, 0));
		part3.add(lProdColor);
		part3.add(tProdColor);

		part4 = new JPanel();
		part4.setLayout(new GridLayout(1, 0));
		part4.add(lProdQty);
		part4.add(tProdQty);


		p1 = new JPanel();
		p1.setLayout(new GridLayout(0, 1));
		p1.add(part1);
		p1.add(part2);
		p1.add(part3);
		p1.add(part4);

		p2 = new JPanel();
		p2.add(btnSearch);
		p2.add(btnInsert);
		p2.add(btnUpdate);
		p2.add(btnDelete);

		// Listener를 등록합니다.
		btnSearch.addActionListener(new ProdHandler());
		btnInsert.addActionListener(new ProdHandler());
		btnUpdate.addActionListener(new ProdHandler());
		btnDelete.addActionListener(new ProdHandler());

		initTable(); // 최초 실행 시 DB와 연동해서 회원 데이터 조회 후,테이블을 초기화합니다.

		// 회원 정보 표시 테이블을 중앙에 위치시킵니다.
		frame.add(p1, BorderLayout.NORTH);
		frame.add(new JScrollPane(prodTable), BorderLayout.CENTER);
		frame.add(p2, BorderLayout.SOUTH);

		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame 종료
		frame.setVisible(true);

	}

	public class ProdHandler implements ActionListener {
		String prodCode = null, prodName = null, prodColor = null;
		int prodQty = 0;

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnSearch) {
				String prodName = tProdName.getText();
				ProdVO prodVO = new ProdVO();
				prodVO.setProdName(prodName);
				List<ProdVO> prodList = prodController.listProd(prodVO);
				loadTableData(prodList);

				return;

			} else if (e.getSource() == btnInsert) {
				// 사용자가 입력한 제품 정보를 가지고 온다.
				ProdVO prodVO = new ProdVO();
				prodCode = tProdCode.getText();
				prodName = tProdName.getText();
				prodColor = tProdColor.getText();
				prodQty = Integer.parseInt(tProdQty.getText());

				prodVO.setProdCode(prodCode);
				prodVO.setProdName(prodName);
				prodVO.setProdColor(prodColor);
				prodVO.setProdQty(prodQty);

				// 제품 정보를 추가한다.
				prodController.addProd(prodVO);
			} else if (e.getSource() == btnUpdate) {
				System.out.println("수정 버튼 클릭");

				prodCode = (String) prodItems[rowIdx][0];
				prodName = (String) prodItems[rowIdx][1];
				prodColor = (String) prodItems[rowIdx][2];
				prodQty = Integer.parseInt((String) prodItems[rowIdx][3]);
				ProdVO prodVO = new ProdVO(prodCode, prodName, prodColor, prodQty);
				prodController.modProd(prodVO);

			} else if (e.getSource() == btnDelete) {
				System.out.println("삭제 버튼 클릭");
				prodCode = (String) prodItems[rowIdx][0];
				ProdVO prodVO = new ProdVO();
				prodVO.setProdCode(prodCode);
				prodController.removeProd(prodVO);
			}

			// CRUD 작업 후 다시 테이블에 제품 정보를 로드합니다.
			List<ProdVO> prodList = new ArrayList<ProdVO>();
			ProdVO prodVO = new ProdVO();
			prodList = prodController.listProd(prodVO);
			loadTableData(prodList);
		}

	}

	public static void main(String args[]) {
		ProdWindow prodWindow = new ProdWindow();
		prodWindow.createGUI();
	}

}
