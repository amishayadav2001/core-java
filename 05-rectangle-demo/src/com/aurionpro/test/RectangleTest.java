package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle =new Rectangle();
		
		rectangle.height=11;
		rectangle.width=33;
		
		double area=rectangle.calculateArea();
		
		System.out.println(area);
			
	}

}
