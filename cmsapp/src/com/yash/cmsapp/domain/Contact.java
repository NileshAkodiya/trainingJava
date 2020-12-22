package com.yash.cmsapp.domain;
/*
 * It is model class for contact inherits properties Person class also having more fields and getter
 * setter for them.
 */
public class Contact extends Person {
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
