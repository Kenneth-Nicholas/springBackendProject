package entity;

public class Description {
	
	private String text;
	
	public Description() {
		super();
	}

	public Description(String text) {
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
		return "Description [text=" + text + "]";
	}
	
}