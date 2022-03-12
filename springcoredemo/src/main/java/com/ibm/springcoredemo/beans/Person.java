package com.ibm.springcoredemo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String ssn="1001";
	private String name="Souvik Pal";
	@Autowired
	private Address address;
	public Person() {}
	public Person(String ssn, String name, Address address) {
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}
	public Person(Address address) {
		this.address = address;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
