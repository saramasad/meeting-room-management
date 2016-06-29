package com.progressoft.induction.meeting.rooms.management;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "meeting")
public class Meeting {
	
	@Id
	@Column(name = "meeting_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer meetingId;

	@ManyToOne
	@JoinColumn(name = "room_name")
	private MeetingRoom meetingRoom;
	
	@ManyToMany
	@JoinTable(name = "enrollment", joinColumns = @JoinColumn(name = "meeting_id"), inverseJoinColumns = @JoinColumn(name = "username"))
	private List<User> attendees;
	
	@Column(name = "meeting_date")
	@Temporal(TemporalType.DATE)
	private Date meetingDate;
	
	@Column(name = "start_time")
	@Temporal(TemporalType.TIME)
	private Date startTime;
	
	@Column(name = "end_time")
	@Temporal(TemporalType.TIME)
	private Date endTime;
	
	@ManyToOne
	@JoinColumn(name = "username")
	private User owner;

	public Integer getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Integer meetingId) {
		this.meetingId = meetingId;
	}

	public MeetingRoom getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	public List<User> getAttendees() {
		return attendees;
	}

	public void setAttendees(List<User> attendees) {
		this.attendees = attendees;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
