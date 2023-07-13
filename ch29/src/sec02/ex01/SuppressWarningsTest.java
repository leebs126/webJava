package sec02.ex01;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List studentList = new ArrayList();  //"unchecked로 지정하므로 경고가 발생하지 않습니다.
		studentList.add(new  Object());   //rawtypes로 지정하므로 경고가 발생하지 않습니다.
	}
}
