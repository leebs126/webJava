package sec05.ex02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class ScoreTest {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		String inMessage = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		try {
			socket = new Socket("121.168.202.151", 8888);
			is = socket.getInputStream();
			os = socket.getOutputStream();

			br = new BufferedReader(new InputStreamReader(is));
			inMessage = br.readLine();
			System.out.println(inMessage);

			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("종료: exit");	
				System.out.print("학생이름:");
				String name = sc.nextLine();
				
				if (name.equals("exit"))
					break;


				System.out.print("국어 점수:");
				int kor = sc.nextInt();
				sc.nextLine();

				System.out.print("영어 점수:");
				int eng = sc.nextInt();
				sc.nextLine();

				System.out.print("수학 점수:");
				int math = sc.nextInt();
				sc.nextLine();
				
			oos = new ObjectOutputStream(os);

			Student student = new Student(name, kor, eng, math);
			oos.writeObject(student);

			ois = new ObjectInputStream(is);
			Student result = (Student) ois.readObject();

			String name1 = result.name;
			double total = result.total;
			double average = result.average;

			System.out.println("이름: " + name1 + ", 총점: " + total + ", 평균:" + average);
			System.out.println();

			 }
			oos.close();
			ois.close();
			sc.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
