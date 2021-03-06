package nc.ukma.thor.spms.entity;

import java.util.List;

public class Team {

	private long id;
	private String name;
	private List<Meeting> meetings;
	
	public Team() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meeting> meetings) {
		this.meetings = meetings;
	}
}
