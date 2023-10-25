package com.aurionpro.model;

public class SalesPerson {
	private int id;
	private String name;
	private CityType city;
	private int experience;
	private double salesAmount;

	
	public SalesPerson(int id, String name, CityType city, int experience, double salesamount) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.experience = experience;
		this.salesAmount = salesamount;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public CityType getCity() {
		return city;
	}


	public void setCity(CityType city) {
		this.city = city;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public double getsalesAmount() {
		return salesAmount;
	}


	public void setSalesamount(double salesamount) {
		this.salesAmount = salesamount;
	}


}
