package com.yash.cmsapp.controller;
/*
 * this servlet ContactDeletionController works as controller for deleting a contact.
 * It gets contact id from from and passes to  currospond service method(deleteContact) 
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.serviceimpl.ContactServiceImpl;

/**
 * Servlet implementation class ContactDeletionController
 */
@WebServlet("/ContactDeletionController")
public class ContactDeletionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ContactService contactService=null;
	public ContactDeletionController() {
		contactService=new ContactServiceImpl();
	}	

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id=Integer.parseInt(request.getParameter("id"));
		Contact contact=new Contact();
		contact.setId(id);
		
		contactService.deleteContact(contact);
		
		response.sendRedirect("./userDashboard.jsp");
	}

}
