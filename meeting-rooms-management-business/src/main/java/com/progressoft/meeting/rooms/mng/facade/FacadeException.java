package com.progressoft.meeting.rooms.mng.facade;

/**
 * Defines a facade exception to handle all kinds of facade exceptions.
 * 
 * @author u591
 *
 */
public class FacadeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public FacadeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FacadeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public FacadeException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public FacadeException(Throwable cause) {
		super(cause);
	}
}
