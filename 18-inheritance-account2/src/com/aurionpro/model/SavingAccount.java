package com.aurionpro.model;

public class SavingAccount extends Account {

	private static final int MIN_BALANCE = 1000;

	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if (this.getBalance() - amount > MIN_BALANCE){
		    this.setBalance(this.getBalance() - amount);
			return true;
		}
		
			return false;
		

	}


}
