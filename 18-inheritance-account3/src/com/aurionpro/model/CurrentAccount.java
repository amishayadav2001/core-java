package com.aurionpro.model;

public  class CurrentAccount extends Account {

	private static final int OVER_DRAFT = 25000;

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if (balance - amount > OVER_DRAFT){
			balance = balance- amount;
			return true;
		}
		return false;

	}

}
