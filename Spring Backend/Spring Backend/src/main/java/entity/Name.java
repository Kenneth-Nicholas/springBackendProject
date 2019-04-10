package entity;

public class Name {

	private String text;
	
	public Name() {
		super();
	}

	public Name(String text) {
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
		return "Name [text=" + text + "]";
	}
	
}