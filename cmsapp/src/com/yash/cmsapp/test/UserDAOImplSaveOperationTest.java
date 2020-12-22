package com.yash.cmsapp.test;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.daoimpl.UserDAOImpl;
import com.yash.cmsapp.domain.User;

public class UserDAOImplSaveOperationTest {

	public static void main(String[] args) {
		UserDAO userDAO=new UserDAOImpl();
		User user=new User();
		user.setName("Nil");
		user.setContact("1230987564");
		user.setLoginName("Nil@789");
		user.setPassword("Nil@0912");
		userDAO.save(user);
	}

}
