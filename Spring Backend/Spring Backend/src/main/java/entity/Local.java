package entity;

public class Local {
	
	private String text;

	public Local() {
		super();
	}

	public Local(String text) {
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