package sec02.ex01;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MovieWindow extends JFrame implements ActionListener {
	String resultMsg = null;
	JTextField tMovieTitle;
	JButton btnTitleInsert;
	JButton btnSave;
	List movieList;
	JButton btnExit;
	MovieController controller;

	public MovieWindow() {
		super("영화정보 관리 화면");
		tMovieTitle = new JTextField(30);
		btnTitleInsert = new JButton("영화제목 추가");
		btnSave = new JButton("영화제목 파일 저장");
		movieList = new List();
		controller = new MovieController();
		btnExit = new JButton("종료");
		
		tMovieTitle = new JTextField(30);
		btnTitleInsert = new JButton("영화제목 추가");
		btnSave = new JButton("영화제목 파일 저장");
		movieList = new List();
		btnExit = new JButton("종료");
		
		movieList.setBackground(Color.green);
		Panel p = new Panel();
		p.add(new Label("영화제목 입력"));
		p.add(tMovieTitle);
		p.add(btnTitleInsert);
		p.add(btnSave);
		add(BorderLayout.NORTH, p);
		add(BorderLayout.CENTER, movieList);
		add(BorderLayout.SOUTH, btnExit);
		setBounds(0, 0, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// Listener와 연결합니다.
		movieList.addActionListener(this);
		btnTitleInsert.addActionListener(this);
		btnSave.addActionListener(this);
		btnExit.addActionListener(this);
	}
	
	public void createMovieController() {
		controller = new MovieController();
	}

	public static void main(String[] args) {
		MovieWindow movie = new MovieWindow();
		movie.createMovieController();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			String mTitle = e.getActionCommand();

			// 영화정보를 추가한다.
			if (e.getSource() == btnTitleInsert) {
				System.out.println("영화제목 추가하기");
				// 텍스트필드에 입력한 영화제목을 가지고 온다.
				mTitle = tMovieTitle.getText().trim();
				controller.addTitle(mTitle, movieList);
				tMovieTitle.setText("");
				resultMsg = "영화 제목을 추가했습니다.";

				// 영화제목을 파일에 저장한다.
			} else if (e.getSource() == btnSave) {
				System.out.println("파일 저장");
				controller.saveTitles(movieList);
				resultMsg = "영화제목을 파일에 저장했습니다.";
			} else {
				controller.delTitle(mTitle, movieList);
				resultMsg = "영화제목을 삭제했습니다.";
			}
			// 다이얼로그로 처리 결과를 보여 준다.
			JOptionPane.showMessageDialog(this, resultMsg, "메시지 박스", JOptionPane.INFORMATION_MESSAGE);
			if (e.getSource() == btnExit)
				System.exit(1);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
