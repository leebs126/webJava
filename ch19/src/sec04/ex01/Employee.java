package sec04.ex01;

import java.io.Serializable;

public class Employee implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2947731916561534066L;
	private String name;
	private String addr;
	private String jumin;
//	transient  private String jumin;
//	static private String nationality = "대한민국";
	private String phone;
	

	public Employee() {}

	public Employee(String name, String addr, String jumin, String phone) {
		this.name = name;
		this.addr = addr;
		this.jumin = jumin;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
