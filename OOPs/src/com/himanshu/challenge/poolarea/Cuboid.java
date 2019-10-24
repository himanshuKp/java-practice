package com.himanshu.challenge.poolarea;

public class Cuboid extends Rectangle{
	private double height;

	public Cuboid(double width, double length, double height) {
		super(width, length);
		if(height<0) {
			this.height = 0;
		}else {
			this.height = height;
		}
	}
	
	protected double getHeight() {
		return this.height;
	}
	
	protected double getVolume() {
		return getArea()*this.height;
	}
	
}
