package com.yash.cmsapp.dao;

import java.util.List;

import com.yash.cmsapp.domain.Contact;

/*
 * This interface ContactDAO declares all CRUD operations that can be performed on Contact.
 */
public interface ContactDAO {
	void save(Contact contact);
	List<Contact> findAll();
	Contact findById(int id);
	void update(Contact contact);
	void delete(Contact contact);
	void delete(int id);
}
