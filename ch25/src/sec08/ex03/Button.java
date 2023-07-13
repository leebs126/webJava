package sec08.ex03;

public class Button {
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}

}
