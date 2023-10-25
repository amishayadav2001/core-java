package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		setRectangleValuesFromUser(rectangle);
		
		Rectangle rectangle2 = new Rectangle();
		setRectangleValuesFromUser(rectangle2);

	}

	public static void setRectangleValuesFromUser(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of height:");
	

		rectangle.setHeight(sc.nextDouble());

		System.out.println("Enter the value of width:");
		rectangle.setWidth(sc.nextDouble());

		System.out.println("Enter the colour Red,blue,green:");

		try {

			rectangle.setColor(Color.valueOf(sc.next().toUpperCase()));
		} catch (IllegalArgumentException e) {
			rectangle.setColor(Color.RED);
		}
		double area = rectangle.calculateArea();
		System.out.println(
				"height is " + rectangle.getHeight() + " Width is " + rectangle.getWidth() + " Area is " + area);
		System.out.println(rectangle.getColor());

	}

}
