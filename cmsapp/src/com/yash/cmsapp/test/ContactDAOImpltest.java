package com.yash.cmsapp.test;

import com.yash.cmsapp.daoimpl.ContactDAOImpl;
import com.yash.cmsapp.domain.Contact;

public class ContactDAOImpltest {

	public static void main(String[] args) {
		
		ContactDAOImpl contactDAOImpl=new ContactDAOImpl();
		Contact contact=new Contact();
		contact.setUserId(1);
		contact.setName("Nilesh");
		contact.setAddress("dewas");
		contact.setContact("70496349");
		contact.setEmail("avc@afa");
		contactDAOImpl.save(contact);
	}

}