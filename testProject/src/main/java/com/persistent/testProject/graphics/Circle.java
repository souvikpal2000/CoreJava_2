package com.persistent.testProject.graphics;

public class Circle {

	private int radius;
	public Circle() {}
	public Circle(int radius) {
		super();
		this.setRadius(radius);
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area() {
		return 3.14 * radius * radius;
	}
}
