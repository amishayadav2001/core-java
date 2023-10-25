package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Border;
import com.aurionpro.model.Circle;

public class CircleTest {
	public static void main(String[] args) { 
		Circle c1 = new Circle(); 
		
		c1.setRadius(11);
		c1.setBorder(Border.DOTTED);
		c1.setColor(Color.BLUE);
		System.out.println(c1.getRadius());
		System.out.println(c1.getBorder());
		System.out.println(c1.getColor());
		double area = c1.calculateArea();
		double Perimeter = c1.calculatePerimeter();
		
		
		
		System.out.println("Radius is " + c1.getRadius() + " Border is " + c1.getBorder() + " Area is " + area + "perimeter is" + c1.calculatePerimeter());

				
	}
}
