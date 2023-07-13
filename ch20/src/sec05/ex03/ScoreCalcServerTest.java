package sec05.ex03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class ScoreCalcServerTest {

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
			
			
			while (true) {
				ObjectInputStream ois = new ObjectInputStream(is);
				ObjectOutputStream oos = new ObjectOutputStream(os);

				
				ArrayList<Student> sList = (ArrayList<Student>)ois.readObject();
				ArrayList<Student> resultList = calcScore(sList);
				oos.writeObject(resultList);
				
				ois.close();
				oos.close();

			}
		}catch(SocketException e) {
			System.out.println("연결이 해제됐습니다.");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static ArrayList<Student> calcScore(ArrayList<Student> sList) {
//		System.out.println(sList.toString());
		ArrayList<Student> resultList = new ArrayList<Student>();
		
		Set set = null;
		HashMap<String, Integer> sMap = new HashMap<String, Integer>();
		for(int i=0; i< sList.size();i++) {
			Student student = sList.get(i);
			String name = student.name;
			int score = student.score;
			
			set = sMap.keySet();
			if(set.contains(name)) {
				int oldScore = sMap.get(name);
				sMap.put(name, oldScore + score);
			}else {
				sMap.put(name, score);
			}
			
		}
		
		//평균 계산하기
		set = sMap.keySet();
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String name = (String)iterator.next();
			double total = sMap.get(name);
			double average = total/3.0;
			Student student = new Student(name, total, average);
			resultList.add(student);
		}
		
		return resultList;

	}

}
