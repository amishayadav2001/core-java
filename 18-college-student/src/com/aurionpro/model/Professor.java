package com.aurionpro.model;

import java.time.LocalDate;

public class Professor extends Person implements SalariedEmployee {
	private double salary;

	public Professor(int id, String address, LocalDate dob, String branch) {
		super(id, address, dob);
		this.salary = salary;
	}

//	@Override
//	public double calculateSalary() {
//		return salary;
//	}

	@Override
	public String toString() {
		return "Professor\n" + super.toString() + "\nsalary=" + salary + " ";
	}

	@Override
	public double annualSalary() {
		return 0;
	}

}
