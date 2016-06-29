package com.progressoft.meeting.rooms.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.progressoft.induction.meeting.rooms.management.User;
import com.progressoft.meeting.rooms.mng.facade.UserFacade;

/**
 * Defines a controller to serve the search users request.
 * 
 * @author u591
 *
 */
@Controller
@RequestMapping("listUsers")
public class ListUsersController {

	@Autowired
	private UserFacade userFacade;

	@RequestMapping(method = RequestMethod.GET)
	public String search(Map<String, Object> model) {
		List<User> users = userFacade.listUsers();
		model.put("users", users);
		return "listUsers";
	}
}
