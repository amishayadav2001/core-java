package com.aurionpro.model;

import java.time.LocalDate;

public abstract class Vehicle {
	protected String model;
	protected LocalDate dom;

	public Vehicle(String model, LocalDate dom) {
		super();
		this.model = model;
		this.dom = dom;
	}

	public abstract void showTopSpeed();

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", dom=" + dom + "]";
	}

}
