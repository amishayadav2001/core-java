package com.aurionpro.test;

import com.aurionpro.model.Car;

public class CarTest {

	public static void main(String[] args) {
		int n = 3;

		Car[] cars = new Car[n];

		cars[0] = new Car("Mahindra Thar", 20.9, 30000);
		cars[1] = new Car("Scorpio", 19.3, 33000);
		cars[2] = new Car("Maruti", 23.5, 44000);

		System.out.println("Details of Cars:");
		System.out.println("------------------------------");

		for (int i = 0; i < n; i++) {
			Car car = cars[i];
			System.out.println("Car " + (i + 1) + ":");
			System.out.println("Company Name: " + car.getCompanyName());
			System.out.println("Mileage: " + car.getMileage() + " km/h");
			System.out.println("Price: " + car.getPrice());
			System.out.println("-------------------------------");

		}

	}
}
