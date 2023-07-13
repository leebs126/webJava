package sec03.ex01;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		Vector vector = new Vector();
		vector.add("Hello");
		vector.add(new Integer(178));
		vector.add(new Float(4.56F));
		vector.add(new Student());

//		for (int i = 0; i < vector.size(); i++) {
//			System.out.println(vector.get(i));
//		}

		Enumeration enu = vector.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

	}

}
