package sec05.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class ScoreServerTest {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream is = null;
		BufferedWriter bw = null;
		PrintWriter writer = null;
		OutputStream os = null;
		
		try {
			serverSocket = new ServerSocket(8888);
			System.out.println("서버 실행 중...");
			socket = serverSocket.accept();

			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			bw = new BufferedWriter(new OutputStreamWriter(os));
			
			writer = new PrintWriter(bw, true);
			writer.println("서버: 접속을 환영합니다. 학생 점수를 보내세요.");
			
			while (true) {
				ObjectInputStream ois = new ObjectInputStream(is);
				ObjectOutputStream oos = new ObjectOutputStream(os);

				
				Student student = (Student)ois.readObject();
				Student result = calcScore(student);
				oos.writeObject(result);

			}
		}catch(SocketException e) {
			System.out.println("연결이 해제됐습니다.");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static Student calcScore(Student student) {
		String name = student.name;
		int kor = student.kor;
		int eng = student.eng;
		int math = student.math;
		
		double total = kor + eng + math;
		double average = total/3.0;
		System.out.println("total: " + total+", average: " + average);
		Student result = new Student(name, total, average);
		return result;

	}

}
