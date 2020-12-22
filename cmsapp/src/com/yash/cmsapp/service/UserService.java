package com.yash.cmsapp.service;

import com.yash.cmsapp.domain.User;
/*
 * It declares methods at business level most of methods are having it definition for calling  method 
 * in DAO only. It works as bridge between CRUD implementation(i.e. UserDAO ) and controller.
 */
public interface UserService {

	int ROLE_ADMIN=1;
	int ROLE_GUEST_USER=2;
	
	
	void registerUser(User user);
	User userAuthentication(String loginName, String password);
	
}
