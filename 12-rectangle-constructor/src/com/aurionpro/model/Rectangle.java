  package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double width;
	private Color color;
	
	public Rectangle(double height,double width,Color color) {
		this.height=height;
		this.width=width;
		this.color=color;
	}
	
	public Rectangle() {
		this.height=0.0;
		this.width=0.0;
		this.color=color;
	}


	public void setHeight(double height) {

		this.height = correctFieldValues(height);
	}

	public void setWidth(double width) {
		this.width = correctFieldValues(width);
	}

	public void setColor(Color color) {
		this.color = (color);
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
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

//	private String correctFieldColor(String color) {
//		if (val.equalsIgnoreCase("RED")) {
//			color = "RED";
//		} else if (val.equalsIgnoreCase("BLUE")) {
//			color = "BLUE";
//		} else if (val.equalsIgnoreCase("GREEN")) {
//			color = "GREEN";
//		} else {
//			color = "RED";
//		}
//		return color;
//	}

	public double calculateArea() {

		return this.height * this.width;
	}
}
