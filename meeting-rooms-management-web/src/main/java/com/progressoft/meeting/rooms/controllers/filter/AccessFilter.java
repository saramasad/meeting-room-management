package com.progressoft.meeting.rooms.controllers.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author u152
 *
 */
public class AccessFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		if (session == null) {

			((HttpServletResponse) response).sendRedirect("http://localhost:8080/meeting-room-management/login");
		} else {
			String username = (String) session.getAttribute("username");
			if (StringUtils.isEmpty(username))
				((HttpServletResponse) response).sendRedirect("http://localhost:8080/meeting-room-management/login");
		}
		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {

	}

}
