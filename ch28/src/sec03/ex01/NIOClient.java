package sec03.ex01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet.ColorAttribute; 
public class NIOClient implements ActionListener { 
	private JFrame jframe; 
	private JTextField jtf; 
	private JTextArea jta; 
	private JLabel jlb1;
	private JPanel jp1, jp2; 
	private String id; 
	private JButton jbtn; 
	private Selector selector; 
	private SocketChannel sc; 
	private ByteBuffer buffer; 
	public NIOClient(String argId) { 
		id = argId; 
		jframe = new JFrame("멀티 채팅 프로그램"); 
		jtf = new JTextField(30); 
		jta = new JTextArea("", 10, 50); 
		jlb1 = new JLabel("사용자 아이디 : [[ " + id + "]]"); 
		jbtn = new JButton("종료"); 
		jp1 = new JPanel(); 
		jp2 = new JPanel(); 
		jlb1.setBackground(Color.yellow); 
		jta.setBackground(Color.green); 
		jp1.setLayout(new BorderLayout()); 
		jp2.setLayout(new BorderLayout()); 

		jp1.add(jbtn, BorderLayout.EAST); 
		jp1.add(jtf, BorderLayout.CENTER); 
		jp2.add(jlb1, BorderLayout.CENTER); 

		jframe.add(jp1, BorderLayout.SOUTH); 
		jframe.add(jp2, BorderLayout.NORTH); 
		JScrollPane jsp = new JScrollPane(jta, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
		jframe.add(jsp, BorderLayout.CENTER);

		jtf.addActionListener(this); 
		jbtn.addActionListener(this); 
		jframe.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				try { 
					buffer.clear(); 
					String msg = id + "#exit"; 
					buffer.put(msg.getBytes()); 
					buffer.flip(); 
					sc.write(buffer); 
				} catch (IOException ee) { 
					ee.printStackTrace(); 
				} 
				System.exit(0); 
			} 
			public void windowOpened(WindowEvent e) { 
				jtf.requestFocus(); 
			} 
		}); 
		jta.setEditable(false); 
		Toolkit tk = Toolkit.getDefaultToolkit(); 
		Dimension d = tk.getScreenSize(); 
		int screenHeight = d.height; 
		int screenWidth = d.width; 
		jframe.pack(); 
		jframe.setLocation( 
				(screenWidth - jframe.getWidth()) / 2, 
				(screenHeight - jframe.getHeight()) / 2); 
		jframe.setResizable(false); 
		jframe.setVisible(true); 
	} 

	public void actionPerformed(ActionEvent e) { 
		Object obj = e.getSource();
		String msg = jtf.getText(); 
		if (obj == jtf) { 
			if (msg == null || msg.length()==0) { 
				JOptionPane.showMessageDialog(jframe, 
						"메지시를 입력하세요.", "경고", 
						JOptionPane.WARNING_MESSAGE); 
			} else { 
				try { 
					msg = id+ " # " +msg; 
					buffer.clear(); 
					buffer.put(msg.getBytes()); 
					buffer.flip(); 
					sc.write(buffer);   //서버로 메시지를 전송합니다. 
				} catch (IOException ee) { 
					ee.printStackTrace(); 
				} 
				jtf.setText(" "); 
			} 
		} else if (obj == jbtn) { 
			try { 
				buffer.clear(); 
				msg = id + "#exit"; 
				buffer.put(msg.getBytes()); 
				buffer.flip(); 
				sc.write(buffer); 
			} catch (IOException ee) { 
				ee.printStackTrace(); 
			} 
			System.exit(0); 
		} 
	} 
	public void exit(){ 
		System.exit(0); 
	} 
	public void init() throws IOException {
		buffer = ByteBuffer.allocateDirect(1024);  //메시지 송신용 버퍼
		selector = Selector.open(); 
		sc = SocketChannel.open(new InetSocketAddress("localhost",9988)); 
		sc.configureBlocking(false); 
		sc.register(selector,SelectionKey.OP_READ); 
		NIOMultiClientThread ct = new NIOMultiClientThread(this); 
		Thread t = new Thread(ct); 
		t.start(); 
	} 
	public static void main(String args[]) throws IOException { 
		JFrame.setDefaultLookAndFeelDecorated(true); 
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		NIOClient cc = new NIOClient(id); 
		cc.init(); 
		sc.close();
	} 
	public JTextArea getJta(){ 
		return jta; 
	} 
	public String getId(){ 
		return id; 
	} 
	
	public Selector getSelector(){ 
		return selector; 
	} 
} 
