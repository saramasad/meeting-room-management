package com.progressoft.meeting.rooms.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.progressoft.induction.meeting.rooms.management.MeetingRoom;
import com.progressoft.meeting.rooms.controllers.model.MeetingsRoomForm;
import com.progressoft.meeting.rooms.mng.facade.FacadeException;
import com.progressoft.meeting.rooms.mng.facade.MeetingRoomFacade;

@Controller
@RequestMapping("/addMeetingRoom")
public class MeetingRoomController {
	
	@Autowired
	private MeetingRoomFacade meetingRoomFacade;
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayForm(Map<String, Object> model) {
		return "addMeetingRoom";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String addMeetingRoom(@ModelAttribute MeetingsRoomForm form, Map<String, Object> model) {
		try {
			MeetingRoom meetingRoom = new MeetingRoom();
			meetingRoom.setRoomName(form.getRoomname());
			meetingRoom.setLocation(form.getLocation());
			meetingRoom.setCapacity(form.getCapacity());
			meetingRoom.setEquipment(form.getEquipment());
			meetingRoomFacade.addMeetingRoom(meetingRoom);
		} catch(FacadeException e) {
			model.put("error", e.getMessage());
			return "addMeetingRoom";
		}
		return "redirect:/admin/listUsers";
	}

}
