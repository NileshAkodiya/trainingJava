package com.yash.cmsapp.controller;
/*
 * this servlet UserRegistrationController works as controller for registering of user.
 * It gets all data of user from from and passes to  currospond service method(registerUser).
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserRegistrationController
 */
@WebServlet("/UserRegistrationController")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService =null;
	
	public UserRegistrationController() {
		userService=new UserServiceImpl();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get data from user form and prepare model
		User user=new User();
		user.setName(request.getParameter("name"));
		user.setContact(request.getParameter("contact"));
		user.setLoginName(request.getParameter("loginName"));
		user.setPassword(request.getParameter("password"));
		
		//sharing model with service
		userService.registerUser(user);
		
		// redirecting on view 
		response.sendRedirect("./index.jsp");
	}

}
