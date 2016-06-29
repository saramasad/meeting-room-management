package com.progressoft.meeting.rooms.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.progressoft.induction.meeting.rooms.management.User;
import com.progressoft.meeting.rooms.mng.facade.FacadeException;
import com.progressoft.meeting.rooms.mng.facade.UserFacade;

/**
 * Defines a controller to serve the add user request.
 * 
 * @author u591
 *
 */
@Controller
@RequestMapping("/addUser")
public class UserController {

	@Autowired
	private UserFacade userFacade;

	@RequestMapping(method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user, Map<String, Object> model) {
		try {
			userFacade.addUser(user);
		} catch(FacadeException e) {
			model.put("error", e.getMessage());
			return "addUser";
		}
		return "redirect:/admin/listUsers";
	}
}
