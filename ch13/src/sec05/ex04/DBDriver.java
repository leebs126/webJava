package sec05.ex04;

public interface DBDriver {
	
	public void connect();  //DB에 연결합니다. 
	
	public void login();  // DB에 로그인 합니다.
	
	public void register();  //DB에 데이터를 저장합니다.
	
	public void search();  //DB의 데이터를 조회합니다.
	
	public void close();   //DB와 접속을 종료합니다.

}
