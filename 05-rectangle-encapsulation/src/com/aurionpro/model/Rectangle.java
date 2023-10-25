package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	
	public void setHeight(double height) {
		if(height>100) {
			height=100;
		}
		else if(height<1) {
			height=1;
		}   
	
		this.height=height;
	}
	
	public void setWidth(double width) {
		if(width>100) {
			width=100;
		}
		else if(width<1) {
			width=1;
		}
		this.width=width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double calculateArea()
	{
		return height*width;
	}

}
