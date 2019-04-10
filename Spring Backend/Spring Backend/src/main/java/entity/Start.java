package entity;

public class Start {
	
	private Timezone timezone;
	private Local local;
	private UTC utc;
	
	public Start() {
		super();
	}

	public Start(Timezone timezone, Local local, UTC utc) {
		super();
		this.timezone = timezone;
		this.local = local;
		this.utc = utc;
	}

	public Timezone getTimezone() {
		return timezone;
	}

	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public UTC getUtc() {
		return utc;
	}

	public void setUtc(UTC utc) {
		this.utc = utc;
	}

	@Override
	public String toString() {
		return "Start [timezone=" + timezone + ", local=" + local + ", utc=" + utc + "]";
	}
	
}
