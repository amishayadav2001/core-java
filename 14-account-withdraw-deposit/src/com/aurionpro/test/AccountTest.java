package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
	public static void main(String[] args) {
		Account savingsAccount = new Account(101, "Amisha", 11000, AccountType.CURRENT);
		System.out.println(savingsAccount);
		
//		Account account1 = new Account();
//		Account account2 = new Account();
//
//		System.out.println(Account.getCount());
//
//		Account account3 = new Account();
//		Account account4 = new Account();
//
//		System.out.println(Account.getCount());

		savingsAccount.deposit(10000);
		System.out.println(savingsAccount);

		withdrawAmount(savingsAccount, 2000);
		System.out.println(savingsAccount);

		withdrawAmount(savingsAccount, 20000);
		System.out.println(savingsAccount);

		withdrawAmount(savingsAccount, 20000);
		System.out.println(savingsAccount);

	}

	private static void withdrawAmount(Account savingsAccount, double amount) {
		if (savingsAccount.withdraw(amount)) {
			System.out.println("Withdrawal is successful");
		} else {
			System.out.println("Insufficient balance");
		}

	}
}
