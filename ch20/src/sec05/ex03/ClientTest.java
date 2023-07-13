package sec05.ex03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class ClientTest {
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		PrintWriter writer = null;
		
		InputStream is = null;
		BufferedReader br = null;
		String inMessage = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			File file = new File("src\\sec05\\ex03\\score.txt");
			
			FileReader fr= new FileReader(file);
			br = new BufferedReader(fr);
			ArrayList<Student> sList = new ArrayList<Student>();
			
			
			int lineNum = 0;
			
			while(true) {
				String str = br.readLine();
				if(str == null)
					break;
				
				System.out.println(str);
			
				if(lineNum > 1 ) {
					String[] token = str.split(" ");
					Student student = new Student(token[0], token[1], Integer.parseInt(token[2]));
					sList.add(student);
				}
			
				
				lineNum++;
			}
			
			socket = new Socket("121.168.202.151", 8888);
			os = socket.getOutputStream();
			is= socket.getInputStream();
			
			oos = new ObjectOutputStream(os);
			oos.writeObject(sList);
			
			ois = new ObjectInputStream(is);
			ArrayList<Student> resultList = (ArrayList<Student>) ois.readObject();
			
			System.out.println();
			System.out.println("학생별 총점과 평균");
			System.out.println("--------------------------------------");
			for(int i=0; i< resultList.size();i++) {
				Student student = resultList.get(i);
				String name1 = student.name;
				double total = student.total;
				double average = student.average;
				System.out.printf("이름: %s, 총점: %.1f, 평균: %.1f",  name1,  total, average);
				System.out.println();
			}

			ois.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
