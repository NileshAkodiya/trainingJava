package com.yash.cmsapp.controller;
/*
 * this servlet ContactCreationController works as controller for inserting a contact.
 * It gets all data from from and passes to  currospond service method(createContact) 
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.serviceimpl.ContactServiceImpl;

@WebServlet("/ContactCreationController")
public class ContactCreationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ContactService contactService=null;
    public ContactCreationController() {
    	contactService=new ContactServiceImpl();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get data from Contact form and prepare model
		Contact contact=new Contact();
		contact.setName(request.getParameter("name"));
		contact.setContact(request.getParameter("contact"));
		contact.setAddress(request.getParameter("address"));
		contact.setEmail(request.getParameter("email"));
		HttpSession session=request.getSession();
		User loggedInUser=(User)session.getAttribute("loggedInUser");
		contact.setUserId(loggedInUser.getId());
		
		

		//sharing model with service
		contactService.createContact(contact);
		

		// redirecting on view 
		response.sendRedirect("./userDashboard.jsp");
	}

}
