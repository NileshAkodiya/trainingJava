package com.yash.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import com.yash.cmsapp.dao.ContactDAO;
import com.yash.cmsapp.domain.Contact;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.util.DBUtil;
/*
 * It it just implementation of each method declared in ContactDAO
 */
public class ContactDAOImpl extends DBUtil implements ContactDAO{
	

	@Override
	public void save(Contact contact) {		
	String sql="insert into contacts(userid,name,contact,address,email)values(?,?,?,?,?)";
	PreparedStatement pstmt=getPreparedStatement(sql);
	try {
		pstmt.setInt(1,contact.getUserId());
		pstmt.setString(2,contact.getName());
		pstmt.setString(3,contact.getContact());
		pstmt.setString(4,contact.getAddress());
		pstmt.setString(5,contact.getEmail());
		int i=pstmt.executeUpdate();
	} catch (Exception e) {
		
	}

		
	}

	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findById(int id) {
		String sql="Select * from contacts where id=?";
		Contact contact =null;
		PreparedStatement pstmt=getPreparedStatement(sql);
		try {
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				contact=new Contact();
				contact.setId(rs.getInt("id"));
				contact.setUserId(rs.getInt("userid"));
				contact.setName(rs.getString("name"));
				contact.setAddress(rs.getString("address"));
				contact.setContact(rs.getString("contact"));
				contact.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return contact;
	}

	@Override
	public void update(Contact contact) {
		
	}

	@Override
	public void delete(Contact contact) {
		String sql="delete from contacts where id=?";
		PreparedStatement pstmt=getPreparedStatement(sql);
		try {
			pstmt.setInt(1,contact.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			
		}
	}
	@Override
	public void delete(int id) {
	}

}
