package sec05.ex01;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p = new Properties();
//		p.setProperty(1, "홍길동");  //에러가 발생합니다.
//		p.setProperty("score",new Integer(100));
		p.setProperty("name", "홍길동");
		p.setProperty("age", "18");
		p.setProperty("job", "프로그래머");

		String name = p.getProperty("name");
		System.out.println("name : " + name);
		System.out.println();

		Enumeration e = p.propertyNames();  //key를 얻습니다.
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(key + " = " + p.getProperty(key));
		}

	}

}
