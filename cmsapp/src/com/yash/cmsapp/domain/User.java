package com.yash.cmsapp.domain;
/*
 * It is model class for user inherits properties Person class also having more fields and getter
 * setter for them.
 */
public class User extends Person{

	private int status;
	private int role;
	private String loginName;
	private String password;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
