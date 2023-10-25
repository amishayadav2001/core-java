package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable {

	public Car(String model, LocalDate dom) {
		super(model, dom);

	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top speed of Car is 120km/hr ");

	}

	@Override
	public void move() {
		System.out.println("Car is moving");

	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", dom=" + dom + "]";
	}

}
