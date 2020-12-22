package com.yash.cmsapp.service;
/*
 * It declares methods at business level most of methods are having it definition for calling  method 
 * in DAO only. It works as bridge between CRUD implementation(i.e. ContactDAO ) and controller.
 */
import java.util.List;

import com.yash.cmsapp.domain.Contact;

public interface ContactService {

	void createContact(Contact contact);
	void editContact(Contact contact);
	void deleteContact(Contact contact);
	Contact searchContact(int id);
	List<Contact> seeAllContact();
}
