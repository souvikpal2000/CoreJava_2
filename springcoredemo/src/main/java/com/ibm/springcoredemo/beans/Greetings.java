package com.ibm.springcoredemo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Greetings implements InitializingBean, DisposableBean {
	private String message;
	private Greetings() {
		System.out.println("Default Constructor");
	}
	private Greetings(String message){
		System.out.println("Paramterized Constructor");
		this.setMessage(message);
	}
	public Greetings createGreetings() {
		System.out.println("createGreeting() method called");
		return new Greetings();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {	
		this.message = message;
	}
	public void initGreet() {
		System.out.println("2nd : Greeting Initilized");
	}
	public void destroyGreet() {
		System.out.println("4th: Greeting Destroyed");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("3rd: Greeting Destroyed : From DisposableBean");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("1st : Greeting Initilized : From InitilizingBean");
	}
}
