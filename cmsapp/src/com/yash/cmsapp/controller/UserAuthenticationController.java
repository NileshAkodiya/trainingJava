package com.yash.cmsapp.controller;
/*
 * this servlet UserAuthenticationController works as controller for Authentication of user.
 * It gets Uname and password from from and passes to  currospond service method(userAuthentication) 
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserAuthenticationController
 */
@WebServlet("/UserAuthenticationController")
public class UserAuthenticationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService =null;
	public UserAuthenticationController() {
		userService=new UserServiceImpl();
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
		
		User loggedInUser=userService.userAuthentication(loginName, password);
		HttpSession session=request.getSession();
		if(loggedInUser==null){
			response.sendRedirect("signIn.jsp");
		}
		else {
		session.setAttribute("name", loggedInUser.getName());
		session.setAttribute("loggedInUser", loggedInUser);
		response.sendRedirect("./userDashboard.jsp");
		}
		
	}

}
