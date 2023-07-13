package sec03.ex02;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class DeSerializationTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Socket socket = new Socket("121.168.202.151", 9999);
		InputStream is = socket.getInputStream();

		ObjectInputStream dis = new ObjectInputStream(is);
		ArrayList<Employee> eList = (ArrayList<Employee>) dis.readObject();

		for (int i = 0; i < eList.size(); i++) {
			Employee employee = eList.get(i);
			System.out.println("이름: " + employee.getName());
			System.out.println("주소: " + employee.getAddr());
			System.out.println("주민번호: " + employee.getJumin());
			System.out.println("전화번호: " + employee.getPhone());
			System.out.println();
		}

		dis.close();
		socket.close();
	}

}
