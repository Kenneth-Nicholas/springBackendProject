package entity;

public class Logo {

	private Original original;
	
	public Logo() {
		super();
	}

	public Logo(Original original) {
		super();
		this.original = original;
	}

	public Original getOriginal() {
		return original;
	}

	public void setOriginal(Original original) {
		this.original = original;
	}

	@Override
	public String toString() {
		return "Logo [original=" + original + "]";
	}
	
}