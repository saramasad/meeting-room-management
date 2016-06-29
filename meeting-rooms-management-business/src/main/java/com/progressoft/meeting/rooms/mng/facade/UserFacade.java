package com.progressoft.meeting.rooms.mng.facade;

import java.util.List;

import com.progressoft.induction.meeting.rooms.management.User;

/**
 * Defines a user facade.
 * 
 * @author u591
 *
 */
public interface UserFacade {

	/**
	 * Adds a user into the database.
	 * 
	 * @param user
	 *            the user to add.
	 */
	public void addUser(User user);

	/**
	 * Deletes a user from the database.
	 * 
	 * @param username
	 *            the username of the user to delete.
	 */
	public void deleteUser(String username);

	/**
	 * Returns a list of users based on <code>firstName</code>,
	 * <code>lastName</code> and <code>gender</code>.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @return
	 */
	public List<User> listUsers();
	
	public void updateUser(User user);
	
	public User getUser(String username);
}
