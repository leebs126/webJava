package sec04.ex02;

import java.util.Arrays;
import java.util.List;

//flatMap() 메서드 이용해서 "홍길동" 이름만 제외해서 출력하기
public class NameTest2 {

	public static void main(String[] args) {
		String[][] nested = new String[][]{{"홍길동", "이순신"}, 
			                               {"박지성", "차범근"}, 
			                               {"손흥민", "임꺽정"}};

	        List<String> nameList = Arrays.stream(nested)  //일차원 배열 Stream 객체 리턴
	                .flatMap(arrName -> Arrays.stream(arrName)) //매개변수로 전달된 일차원 배열의 요소들을 문자열로 분해해서 Stream으로 리턴
	                .filter(name -> !name.equals("홍길동"))
	                .toList();

	        nameList.forEach(System.out::println);		
	}
}



