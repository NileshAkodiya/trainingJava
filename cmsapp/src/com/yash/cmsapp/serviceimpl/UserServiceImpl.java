package com.yash.cmsapp.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.daoimpl.UserDAOImpl;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.util.DBUtil;
/*
 * Implementation of UserService interface.
 */
public class UserServiceImpl extends DBUtil implements UserService {
	private UserDAO userDAO=null;
	
	public UserServiceImpl() {
		userDAO=new UserDAOImpl();	//Dependecy Injection 
	}

	@Override
	public void registerUser(User user) {
		user.setRole(UserService.ROLE_GUEST_USER);
		userDAO.save(user);
	}

	@Override
	public User userAuthentication(String loginName, String password) {
		String sql="Select * from users where loginname=? and password=?";
		User loggedInUser =null;
		PreparedStatement pstmt=getPreparedStatement(sql);
		try {
			pstmt.setString(1, loginName);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			loggedInUser=mapUser(loggedInUser, rs);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return loggedInUser;
	}

	private User mapUser(User loggedInUser, ResultSet rs) throws SQLException {
		if(rs.next()) {
			loggedInUser=new User();
			loggedInUser.setId(rs.getInt("id"));
			loggedInUser.setName(rs.getString("name"));
			loggedInUser.setContact(rs.getString("contact"));
			loggedInUser.setAddress(rs.getString("address"));
			loggedInUser.setEmail(rs.getString("email"));
			loggedInUser.setLoginName(rs.getString("loginname"));
			loggedInUser.setPassword(rs.getString("password"));
			loggedInUser.setRole(rs.getInt("role"));
			loggedInUser.setStatus(rs.getInt("status"));
		}
		return loggedInUser;
	}

}
