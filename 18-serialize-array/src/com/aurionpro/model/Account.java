package com.aurionpro.model;

import java.io.Serializable;

public class Account implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public static char[] toString;
	
	protected int id;
	protected String name;
	protected double balance;

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		}
		balance += amount;
		return true;

	}
	
	public boolean withdraw(double amount) {
		if (balance - amount < 1) {
			return false;
		}
		return true;
	}



	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}

