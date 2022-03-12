package com.persistent.user;

public class User {
	private int uid;
	private String name;
	private String companyName;
	public User(){}
	public User(int uid, String name, String companyName) {
		this.setUid(uid);
		this.setName(name);
		this.setCompanyName(companyName);
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
