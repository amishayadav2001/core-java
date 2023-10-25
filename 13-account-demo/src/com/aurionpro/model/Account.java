package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;
	private AccountType accountType;
	
	
	public Account(int id, String name, double balance, AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
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
	
	public void setAccountType(AccountType accountType) {
		this.accountType=accountType;
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
	
	public AccountType getAccountType() {
		return accountType;
	}

	@Override
	public String toString() {
		return "\nAccount [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
	}
	
	}
