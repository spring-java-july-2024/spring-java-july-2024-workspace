package com.demo.spring_mvc_user_project_demo.pojo;

public class UserPojo {

	private int userId;
	private String userName;
	private String userCity;
	
	public UserPojo(int userId, String userName, String userCity) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userCity = userCity;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	@Override
	public String toString() {
		return "UserPojo [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity + "]";
	}
	
}
