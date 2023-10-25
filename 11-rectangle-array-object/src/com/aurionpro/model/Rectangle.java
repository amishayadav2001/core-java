package com.aurionpro.model;

public class Rectangle {

	private double height;
	private double width;
	private Color color;

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

		return this.height * this.width;
	}
}
