package com.aurionpro.model;

public class Rectangle implements Shape{
	private double heigth;
	private double width;

	public Rectangle(double heigth, double width) {
		super();
		this.heigth = heigth;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [heigth=" + heigth + ", width=" + width + "]";
	}

}
