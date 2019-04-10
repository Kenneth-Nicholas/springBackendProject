package entity;

public class UTC {

	private String text;

	public UTC() {
		super();
	}

	public UTC(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Timezone [text=" + text + "]";
	}
	
}