package com.yash.cmsapp.serviceimpl;
/*
 * Implementation of ContactService interface.
 */
import java.util.List;

import com.yash.cmsapp.dao.ContactDAO;
import com.yash.cmsapp.daoimpl.ContactDAOImpl;
import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.service.ContactService;
import com.yash.cmsapp.util.DBUtil;

public class ContactServiceImpl extends DBUtil implements  ContactService{
	private ContactDAO contactDAO=null;
	public ContactServiceImpl() {
		contactDAO=new ContactDAOImpl();
	}
	@Override
	public void createContact(Contact contact) {
		contactDAO.save(contact);
	}

	@Override
	public void editContact(Contact contact) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteContact(Contact contact) {
		contactDAO.delete(contact);
	}

	@Override
	public Contact searchContact(int id) {
		return contactDAO.findById(id);
	}

	@Override
	public List<Contact> seeAllContact() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
