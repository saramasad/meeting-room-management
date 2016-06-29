package com.progressoft.meeting.rooms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.progressoft.meeting.rooms.mng.facade.UserFacade;

/**
 * Defines a controller to serve the delete user request.
 * 
 * @author u591
 *
 */
@Controller
@RequestMapping("deleteUser")
public class DeleteUserController {

	@Autowired
	private UserFacade userFacade;

	@RequestMapping(method = RequestMethod.POST)
	public String deleteUser(@RequestParam String username) {
		userFacade.deleteUser(username);
		return "redirect:/admin/listUsers";
	}
}
