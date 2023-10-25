package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable {

	public Bike(String model, LocalDate dom) {
		super(model, dom);

	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top speed of vehicle is 80 km/hr");

	}

	@Override
	public void move() {
		System.out.println("Bike is moving");

	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", dom=" + dom + "]";
	}

}
