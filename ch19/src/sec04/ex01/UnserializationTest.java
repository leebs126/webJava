package sec04.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class UnserializationTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("src\\sec04\\ex01\\serial.ser"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			ArrayList<Employee> eList = (ArrayList<Employee>) ois.readObject();
			
			Iterator<Employee> ite = eList.iterator();
			System.out.println("사원 정보 출력");
			System.out.println("--------------------------------");
			while (ite.hasNext()) {
				Employee e = (Employee) ite.next();
				System.out.println("이름: " + e.getName());
				System.out.println("주민번호: " + e.getJumin());
				System.out.println("주소: " + e.getAddr());
				System.out.println("전화번호: " + e.getPhone());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
