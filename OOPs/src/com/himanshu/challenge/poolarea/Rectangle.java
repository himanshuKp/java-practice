package com.himanshu.challenge.poolarea;

public class Rectangle {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		
		if(width<0&&length<0) {
			this.width = 0;
			this.length = 0;
		}else if(width<0) {
			this.width = 0;
		}else if(length<0) {
			this.length = 0;
		}else {
			this.width = width;
			this.length = length;
		}
		
	}
	
	protected double getWidth() {
		return this.width;
	}
	
	protected double getLength() {
		return this.length;
	}
	
	protected double getArea() {
		return this.width*this.length;
	}
}
