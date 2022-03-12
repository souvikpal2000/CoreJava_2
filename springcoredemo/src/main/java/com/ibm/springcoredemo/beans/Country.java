package com.ibm.springcoredemo.beans;

import java.util.List;

public class Country {
	private String countryId;
	private String countryName;
	private List<String> states;
	public Country() {}
	public Country(String countryId, String countryName, List<String> states) {
		this.setCountryId(countryId);
		this.setCountryName(countryName);
		this.setStates(states);
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<String> getStates() {
		return states;
	}
	public void setStates(List<String> states) {
		this.states = states;
	}
}
