package entity;

public class Summary {

	private String text;
	
	public Summary() {
		super();
	}

	public Summary(String text) {
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
		return "Summary [text=" + text + "]";
	}
	
}
