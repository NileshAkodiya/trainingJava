package com.yash.cmsapp.controller;
/*
 * this servlet ContactSearchingController works as controller for searching a contact.
 * It gets id from from and passes to  currospond service method(searchContact) 
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class ContactSearchingController
 */
@WebServlet("/ContactSearchingController")
public class ContactSearchingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactService contactService=null;
	public ContactSearchingController() {
		contactService=new ContactServiceImpl();
	}	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		Contact contact=new Contact();
		contact=contactService.searchContact(id);
		HttpSession session=request.getSession();
		session.setAttribute("contact", contact);
		response.sendRedirect("./displayContact.jsp");
	}

}
