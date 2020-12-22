package com.yash.cmsapp.test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yash.cmsapp.util.DBUtil;

public class DBUtilTest{

	public static void main(String[] args) {
		DBUtil dbUtil=new DBUtil();
		String sql="Select * from users";
		PreparedStatement pstmt=dbUtil.getPreparedStatement(sql);
		try {
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getString(5)+" ");
				System.out.print(rs.getInt(6)+" ");
				System.out.print(rs.getInt(7)+" ");
				System.out.print(rs.getString(8)+" ");
				System.out.print(rs.getString(9)+" ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
