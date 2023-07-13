package sec04.ex01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("류현진", "대전", "770811-222222", "010-123-1234");
		Employee e2 = new Employee("차범근", "서울", "830912-4444444", "010-987-6543");
		ArrayList<Employee> eList = new ArrayList<Employee>();
		eList.add(e1);
		eList.add(e2);

		try {
			FileOutputStream fos = new FileOutputStream(new File("src\\sec04\\ex01\\serial.ser"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(eList);
			
			fos.close();
			oos.close();
			System.out.println("직렬화 객체를 파일로 저장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
