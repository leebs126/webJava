package sec04.ex02;

import java.util.Arrays;
import java.util.List;

public class NameTest2 {

	public static void main(String[] args) {
		String[][] nested = new String[][]{{"홍길동", "이순신"}, 
			                               {"박지성", "차범근"}, 
			                               {"손흥민", "임꺽정"}};
			                               
        List<String[]> nameList = Arrays.stream(nested)
		                .filter(arrName -> { 			// nested가 2차원 배열이기 때문에 실행 시 전달되는 매개값은 1차원 문자열 배열 
		                    for (String name : arrName) { //arrName이 1차원 배열이기 때문에 다시 순회하기 위해 for문 사용
		                        if (name.equals("홍길동")) return false;
		                    }
		                    return true;
		                })
		                .toList(); //일차원 배열 ArrayList로 리턴
        nameList.forEach(name-> System.out.println(Arrays.toString(name)));		
	}
}


