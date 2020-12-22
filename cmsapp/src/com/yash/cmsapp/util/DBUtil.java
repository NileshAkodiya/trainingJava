package com.yash.cmsapp.util;
/*
 * this class will perform common Database operation, getting Connection and Prepared Statement object.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBUtil {

		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		/*
		 * this method returns the connection object.
		 */
		public Connection openConnection() {
			Connection con=null;
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost/cmsdb","root","root");
			} catch (Exception e) {
			}
			return con;
		}
		public PreparedStatement getPreparedStatement(String sql) {
			PreparedStatement pstmt=null;
			try {
				pstmt=openConnection().prepareStatement(sql);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return pstmt;
		}
}
