package com.ibm.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.springcoredemo.beans.Address;
import com.ibm.springcoredemo.beans.Person;

@Configuration
public class AppConfig {
	@Bean
	public Address add1() {
		return new Address("1-2-3", "TestStreet", "Khardah", "West Bengal");
	}
	@Bean
	public Person per1() {
		//return new Person("999", "Souvik Pal", add1());
		Person p = new Person();
		p.setSsn("999");
		p.setName("Souvik Pal");
		return p;
	}
}
