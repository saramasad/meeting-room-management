package com.progressoft.meeting.rooms.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.progressoft.induction.meeting.rooms.management.User;
import com.progressoft.meeting.rooms.mng.facade.FacadeException;
import com.progressoft.meeting.rooms.mng.facade.UserFacade;

@Controller
@RequestMapping("/updateUser")
public class UpdateUserController {

	@Autowired
	private UserFacade userFacade;

	@RequestMapping(method = RequestMethod.GET)
	public String displayForm(@RequestParam String username, Map<String, Object> model) {
		User user = userFacade.getUser(username);
		model.put("username", username);
		model.put("user", user);
		return "updateUser";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user, Map<String, Object> model, HttpServletRequest req) {
		try {
			userFacade.updateUser(user);
		} catch (FacadeException e) {
			model.put("error", e.getMessage());
			return "updateUser";
		}
		return "redirect:/admin/listUsers";
	}
}
