package com.aurionpro.model;

public abstract class Account {
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

	public abstract boolean withdraw(double amount);

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
