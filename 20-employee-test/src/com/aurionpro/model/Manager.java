package com.aurionpro.model;

public class Manager extends Employee{
	
	double hra;
	double da;
	double ta;

	public Manager(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		this.hra = basic * 0.25;
		this.da = basic * 0.15;
		this.ta = basic * 0.10;
	}


	@Override
	public double calculateAnnualCTC() {
		double result = ((basic * 0.25) + (basic * 0.15) + (basic * 0.15) + basic);
		return result;
	}
	
	@Override
	public String toString() {
		return ("[Manager]\nID: " + employeeId + "\nName: " + name + "\nBasic: " + basic + "\nHRA: " + hra + "\nDA: " + da + "\nTA: " + ta);
	}
	
	
}
