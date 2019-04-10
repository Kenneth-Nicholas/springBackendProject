package entity;

public class Timezone {

	private String text;

	public Timezone() {
		super();
	}

	public Timezone(String text) {
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