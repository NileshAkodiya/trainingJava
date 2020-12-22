package com.yash.cmsapp.dao;
/*
 * this interface will provide CRUD operation on User module.
 * 
 */

import java.util.List;

import com.yash.cmsapp.domain.User;

public interface UserDAO {
	void save(User user);
	List<User> findAll();
	void update(User user);
	void delete(User user);
	void delete(int id);
}
