package com.himanshu.challenge.Cylinder;

public class Circle {
	private double radius;

	public Circle(double radius) {
		if(radius<0) {
			this.radius = 0;
		}else {
			this.radius = radius;
		}	
	}
	
	protected double getRadius() {
		return this.radius;
	}
	
	protected double getArea() {
		return (Math.PI*this.radius*this.radius);
	}
		
}
