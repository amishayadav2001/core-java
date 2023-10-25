package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle();
		
		
		rectangle.setHeight(11);
		rectangle.setWidth(33);
		
		double area=rectangle.calculateArea();
		
		System.out.println("Area of the recatangle with height " +rectangle.getHeight() +" and width "+ rectangle.getWidth() + " is " +area);	
			
	}

}
