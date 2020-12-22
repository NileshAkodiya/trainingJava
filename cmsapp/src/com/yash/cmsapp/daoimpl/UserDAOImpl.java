package com.yash.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.util.List;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.service.UserService;
import com.yash.cmsapp.util.DBUtil;
/*
 * It it just implementation of each method declared in UserDAO
 */
public class UserDAOImpl extends DBUtil implements UserDAO{
	
	
	@Override
	public void save(User user) {
		String sql="insert into users(name, contact, role, loginname,password) values(?,?,?,?,?)";
		PreparedStatement pstmt=getPreparedStatement(sql);
		try {
			pstmt.setString(1,user.getName());
			pstmt.setString(2,user.getContact());
			pstmt.setInt(3, UserService.ROLE_GUEST_USER);	
			pstmt.setString(4,user.getLoginName());
			pstmt.setString(5,user.getPassword());
			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
