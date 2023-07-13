package sec04.ex05;

public class Member {
	private String jumin;
	private String name;
	private boolean adult; //성인여부

	public String getJumin() {
		// 보안 등의 이유로 리턴하기 전 주민번호 뒷자리를 "*" 처리해줄 수 있습니다.
		int idx = jumin.indexOf("-");
		String front = jumin.substring(0, idx);
		
		String temp = (jumin.substring(idx + 1, jumin.length()));
		String end = "";
		
		for(int i = 0 ; i < temp.length(); i++) {
			if(i == 0) {
				end +=temp.charAt(i);
			}else {
				end +="*";
			}
		}
		
		return front + "-" + end;
	}

	public void setJumin(String jumin) {
		// 저장 시에 암호화 할 수 있습니다.
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	
	
}
