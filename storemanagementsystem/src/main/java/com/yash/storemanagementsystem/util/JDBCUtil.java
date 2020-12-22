package com.yash.storemanagementsystem.util;
/*
 * this class is created for getting preparedStatement.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
	
	private Connection connection=null;
	PreparedStatement  preparedStatement=null;
	/*
	 * this connect() method is here to create connection object.
	 */
	private Connection connect() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/storedb";
			connection= DriverManager.getConnection(url,"root","root");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
		
	}/*
	 * this getPrepareStatement() method is here to creat PreparedStatement object.
	 */

	public  PreparedStatement getPrepareStatement(String sql) {
		try {
			preparedStatement=connect().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 	preparedStatement;
	}

}
