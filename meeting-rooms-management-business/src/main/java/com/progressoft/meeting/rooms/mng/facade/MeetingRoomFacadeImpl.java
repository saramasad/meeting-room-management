package com.progressoft.meeting.rooms.mng.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.progressoft.induction.meeting.rooms.management.MeetingRoom;
import com.progressoft.induction.meeting.rooms.management.repository.MeetingRoomRepository;

@Transactional
public class MeetingRoomFacadeImpl implements MeetingRoomFacade {

	@Autowired
	private MeetingRoomRepository meetingRoomRepository;

	public void addMeetingRoom(MeetingRoom meetingRoom) {
		meetingRoomRepository.save(meetingRoom);
	}

}
