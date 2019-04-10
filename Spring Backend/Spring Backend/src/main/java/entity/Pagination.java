package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pagination {
	
	private String object_count;
	
	private String page_number;
	
	private String page_size;
	
	private String page_count;
	
	private String has_more_items;

	public Pagination() {
		super();
	}

	public Pagination(String object_count, String page_number, String page_size, String page_count,
			String has_more_items) {
		super();
		this.object_count = object_count;
		this.page_number = page_number;
		this.page_size = page_size;
		this.page_count = page_count;
		this.has_more_items = has_more_items;
	}

	public String getObject_count() {
		return object_count;
	}

	public void setObject_count(String object_count) {
		this.object_count = object_count;
	}

	public String getPage_number() {
		return page_number;
	}

	public void setPage_number(String page_number) {
		this.page_number = page_number;
	}

	public String getPage_size() {
		return page_size;
	}

	public void setPage_size(String page_size) {
		this.page_size = page_size;
	}

	public String getPage_count() {
		return page_count;
	}

	public void setPage_count(String page_count) {
		this.page_count = page_count;
	}

	public String getHas_more_items() {
		return has_more_items;
	}

	public void setHas_more_items(String has_more_items) {
		this.has_more_items = has_more_items;
	}

	@Override
	public String toString() {
		return "Pagination [object_count=" + object_count + ", page_number=" + page_number + ", page_size=" + page_size
				+ ", page_count=" + page_count + ", has_more_items=" + has_more_items + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((has_more_items == null) ? 0 : has_more_items.hashCode());
		result = prime * result + ((object_count == null) ? 0 : object_count.hashCode());
		result = prime * result + ((page_count == null) ? 0 : page_count.hashCode());
		result = prime * result + ((page_number == null) ? 0 : page_number.hashCode());
		result = prime * result + ((page_size == null) ? 0 : page_size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagination other = (Pagination) obj;
		if (has_more_items == null) {
			if (other.has_more_items != null)
				return false;
		} else if (!has_more_items.equals(other.has_more_items))
			return false;
		if (object_count == null) {
			if (other.object_count != null)
				return false;
		} else if (!object_count.equals(other.object_count))
			return false;
		if (page_count == null) {
			if (other.page_count != null)
				return false;
		} else if (!page_count.equals(other.page_count))
			return false;
		if (page_number == null) {
			if (other.page_number != null)
				return false;
		} else if (!page_number.equals(other.page_number))
			return false;
		if (page_size == null) {
			if (other.page_size != null)
				return false;
		} else if (!page_size.equals(other.page_size))
			return false;
		return true;
	}
	
}