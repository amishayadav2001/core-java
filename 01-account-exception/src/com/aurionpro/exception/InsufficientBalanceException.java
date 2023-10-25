package com.aurionpro.exception;

import com.aurionpro.model.Account;

public class InsufficientBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Account account;
	private double amount;
	
	public InsufficientBalanceException(Account account, double amount) {
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String getMessage() {
		
		String message = "Transaction Failed\n";
		message += "Withdrwal amount =" +amount;
		message += "\nAvailable balance =" + account.getBalance();
		return message;
	}
	
	

}
