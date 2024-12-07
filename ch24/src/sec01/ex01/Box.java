package sec01.ex01;

public class Box<T extends Person> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
