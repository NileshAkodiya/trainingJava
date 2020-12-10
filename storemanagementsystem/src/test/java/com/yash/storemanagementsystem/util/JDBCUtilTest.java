package com.yash.storemanagementsystem.util;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.Test;
/*
 * unit tests for JDBCUtilT are there in this class for each method.
 */

public class JDBCUtilTest {

	/*
	 * test for connect method with whether is return Conncection object or not.
	 */
	@Test
	public void test_Connect_ShouldReturnConnectionObject() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method method=JDBCUtil.class.getDeclaredMethod("connect");
		method.setAccessible(true);
		JDBCUtil jdbcUtil=new JDBCUtil();
		Connection connection=(Connection)method.invoke(jdbcUtil);
		assertTrue(connection!=null);
		
	}

	/*
	 * test for connect method with whether is return PreparedStatement object or not.
	 */
	@Test
	public void test_GetPreparedStatement_GivenQueryAsString_ShouldReturnPreparedStatementObject() {
		String query="insert into products (productCustomerId,name,price,description) values(2,'LED',15000,'this is led for  Rs. 15000')";
		PreparedStatement preparedStatementTest=new JDBCUtil().getPrepareStatement(query);
		assertNotNull(preparedStatementTest);
	}
	

}
