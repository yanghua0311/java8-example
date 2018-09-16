package com.young.java8.pojo;

import java.util.Date;

public class User {
	/**
	 * 
	 */
	public User() {
		super();
	}
	private Long userId;
	private String userName;
	private Date loginTime;
	/**
	 * @param i
	 * @param string
	 */
	public User(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the loginTime
	 */
	public Date getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	
}
