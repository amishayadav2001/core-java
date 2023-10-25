package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) { 
		Rectangle rectangle = new Rectangle(); 
		
		rectangle.setHeight(11);
		rectangle.setWidth(33);
		rectangle.setColor(Color.BLUE);
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getColor());
		double area = rectangle.calculateArea();
		System.out.println(
				"height is " + rectangle.getHeight() + " Width is " + rectangle.getWidth() + " Area is " + area);

	}
}
