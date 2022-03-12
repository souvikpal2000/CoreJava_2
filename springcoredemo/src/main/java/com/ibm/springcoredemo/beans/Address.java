package com.ibm.springcoredemo.beans;

public class Address {
	private String hno="14-2-3";
	private String streetName="Adarsha Plaza";
	private String city="Kolkata";
	private String state="West Bengal";
	public Address() {}
	public Address(String hno, String streetName, String city, String state){
		this.setHno(hno);
		this.setStreetName(streetName);
		this.setCity(city);
		this.setState(state);
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
