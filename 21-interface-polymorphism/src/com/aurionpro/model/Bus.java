package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable {

	public Bus(String model, LocalDate dom) {
		super(model, dom);

	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top speed of bus is 100 km/hr");

	}

	@Override
	public void move() {
		System.out.println("Bus is moving");

	}
	
	@Override
	public String toString() {
		return "Bus [model=" + model + ", dom=" + dom + "]";
	}


}
