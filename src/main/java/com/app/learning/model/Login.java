package com.app.learning.model;

public class Login {
	private String userName;

	@Override
	public String toString() {
		return "Login [userName=" + userName + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(final String userName) {
		this.userName = userName;
	}
}
