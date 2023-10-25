package com.aurionpro.test;

import com.aurionpro.exception.InsufficientBalanceException;
import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientFundsException;

public class AccountExceptionTest {

	public static void main(String[] args) {
		Account account = new Account(11, "Amisha", 10000);
		System.out.println(account);

		account.deposit(1000);
		System.out.println(account);

		try {
			account.withdraw(2000);
			System.out.println(account);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of program");

	}

}
