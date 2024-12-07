package sec04.ex02;

import java.util.Arrays;
import java.util.List;

public class NameTest3 {

	public static void main(String[] args) {
		String[][] nested = new String[][]{{"홍길동", "이순신"}, 
			                               {"박지성", "차범근"}, 
			                               {"손흥민", "임꺽정"}};

	        List<String> nameStream = Arrays.stream(nested)
	                .flatMap(arrName -> Arrays.stream(arrName)) //매개변수로 전달된 일차원 배열의 요소들을 문자열 Stream으로 리턴
	                .filter(name -> !name.equals("홍길동"))
	                .toList();

	        nameStream.forEach(System.out::println);		
	}
}





