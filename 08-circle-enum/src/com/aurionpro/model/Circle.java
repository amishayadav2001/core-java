package com.aurionpro.model;

public class Circle {

	private double radius;
	private Border border;
	private Color color;

	public void setRadius(double radius) {

		this.radius = correctFieldValues(radius);
	}

	public void setBorder(Border border) {
		this.border = (border);
	}

	public void setColor(Color color) {
		this.color = (color);
	}

	public double getRadius() {
		return radius;
	}

	public Border getBorder() {
		return border;
	}

	public Color getColor() {
		return color;
	}

	private double correctFieldValues(double value) {
		if (value > 100) {
			value = 100;
		} else if (value < 1) {
			value = 1;
		}
		return value;
	}

//	private String correctFieldColor(String val) {
//		if (val.equalsIgnoreCase("RED")) {
//			val = "RED";
//		} else if (val.equalsIgnoreCase("BLUE")) {
//			val = "BLUE";
//		} else if (val.equalsIgnoreCase("BLUE")) {
//			val = "GREEN";
//		} else {
//			val = "RED";
//		}
//		return val;
//	}

	public double calculateArea() {

		return this.radius*this.radius*Math.PI;
	}
	
	public double calculatePerimeter() {
		return this.radius*2*Math.PI;
	}
}
