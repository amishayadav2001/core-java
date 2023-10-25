package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;
	private GenderType genderType;
	
	
	public Account(int id, String name, double balance, GenderType genderType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.genderType = genderType;
	}

	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void setAccountType(GenderType genderType) {
		this.genderType=genderType;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public GenderType getGenderType() {
		return genderType;
	}

	@Override
	public String toString() {
		return "\nAccount [id=" + id + ", name=" + name + ", balance=" + balance + ", genderType=" + genderType + "]";
	}
	
	}
