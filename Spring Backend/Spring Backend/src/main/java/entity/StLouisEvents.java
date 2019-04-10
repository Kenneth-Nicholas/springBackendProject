package entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StLouisEvents {
	
	private Pagination pagination;
	
	private ArrayList<EventDTO> events = new ArrayList<EventDTO>();
	
	public StLouisEvents() {
		super();
	}

	public StLouisEvents(Pagination pagination, ArrayList<EventDTO> events) {
		super();
		this.pagination = pagination;
		this.events = events;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public ArrayList<EventDTO> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<EventDTO> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "StLouisEvents [pagination=" + pagination + ", events=" + events + "]";
	}

	
}
