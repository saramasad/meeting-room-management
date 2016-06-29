package com.progressoft.meeting.rooms.mng.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.progressoft.induction.meeting.rooms.management.User;
import com.progressoft.induction.meeting.rooms.management.repository.UserRepository;

/**
 * Defines an implementation for the user facade.
 * 
 * @author u591
 *
 */
@Transactional
public class UserFacadeImpl implements UserFacade {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		if (userRepository.exists(user.getUsername())) {
			throw new UserAlreadyExistsException("User already exists.");
		} else {
			userRepository.save(user);
		}
	}

	public void deleteUser(String username) {
		userRepository.delete(username);
	}

	public List<User> listUsers() {
		List<User> users = userRepository.findAll();
		return users;
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public User getUser(String username) {
		User user = userRepository.findOne(username);
		return user;
	}

}
