package entity;

public class Original {
	
	private String url;
	
	public Original() {
		super();
	}

	public Original(String url) {
		super();
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Original [url=" + url + "]";
	}

}