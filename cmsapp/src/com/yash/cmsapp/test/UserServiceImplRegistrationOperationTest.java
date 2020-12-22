package com.yash.cmsapp.test;

import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.serviceimpl.UserServiceImpl;

public class UserServiceImplRegistrationOperationTest {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		User user=new User();
		user.setName("Esh");
		user.setContact("1230987564");
		user.setLoginName("Esh@789");
		user.setPassword("Esh@0912");
		userService.registerUser(user);
	}

}
