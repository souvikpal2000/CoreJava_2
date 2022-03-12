package com.ibm.mvcdemo.entity;

public class User {
	private String username;
	private String password;
	public User() {}
	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User u = (User)obj;
			return username.equals(u.username) && password.equals(u.password);
		}
		return false;
	}
}
