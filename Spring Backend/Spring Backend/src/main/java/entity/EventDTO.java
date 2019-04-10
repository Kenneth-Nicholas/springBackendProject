package entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDTO {

	private Name name;

	private Description description;

	private Start start;

	private End end;

	private Summary summary;

	private Logo logo;

	public EventDTO() {
		super();
	}

	public EventDTO(Name name, Description description, Start start, End end, Summary summary, Logo logo) {
		super();
		this.name = name;
		this.description = description;
		this.start = start;
		this.end = end;
		this.summary = summary;
		this.logo = logo;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Start getStart() {
		return start;
	}

	public void setStart(Start start) {
		this.start = start;
	}

	public End getEnd() {
		return end;
	}

	public void setEnd(End end) {
		this.end = end;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public Logo getLogo() {
		return logo;
	}

	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "EventDTO [name=" + name + ", description=" + description + ", start=" + start + ", end=" + end
				+ ", summary=" + summary + ", logo=" + logo + "]";
	}
	
}