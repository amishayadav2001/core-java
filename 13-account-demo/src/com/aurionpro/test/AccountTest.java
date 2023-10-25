package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;



public class AccountTest {

	public static void main(String[] args) {
		Account[] accounts = { 
				new Account(1, "Amisha", 10000, AccountType.SAVINGS),
				new Account(1, "Reena", 20000, AccountType.CURRENT), 
				new Account(1, "Jay", 30000, AccountType.SAVINGS),
				new Account(1, "Rohan", 40000, AccountType.CURRENT), 
				new Account(1, "Mani", 50000, AccountType.SAVINGS),
				new Account(1, "Swati", 60000, AccountType.CURRENT),
				new Account(1, "Nikki", 70000, AccountType.SAVINGS),
				new Account(1, "Jyoti", 80000, AccountType.CURRENT), 
				new Account(1, "Amir", 90000, AccountType.SAVINGS),
				new Account(1, "Aaru", 100000, AccountType.CURRENT) };
//		 for(Account acc : accounts) {
//		 System.out.println(acc);
//		 }

		Account highestBalanceAccount = findHighestBalanceAccount(accounts);
		System.out.println("Account with highest balance: " + highestBalanceAccount);

		Account highestCurrentBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.CURRENT);
		System.out.println("\nCurrent Account with Highest balance: " + highestCurrentBalanceAccount);

		Account highestSavingsBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.SAVINGS);
		System.out.println("\nSavings Account with Highest Balance: " + highestSavingsBalanceAccount);

		double sumAllAccounts = findSumOfAccountBalance(accounts);
		System.out.println("\nSum of all accounts: " + sumAllAccounts);

		double sumOfAllSavingsAccounts = findSumOfAccountBalance(accounts, AccountType.SAVINGS);
		System.out.println("\nSum of all Savings accounts: " + sumOfAllSavingsAccounts);

		double sumOfAllCurrentAccounts = findSumOfAccountBalance(accounts, AccountType.CURRENT);
		System.out.println("\nSum of all Current accounts: " + sumOfAllCurrentAccounts);
	}

//	private static Account findhighestBalanceAccount(Account[] accounts) {
//		Account maxAccount = accounts[0];
//
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i].getBalance() > maxAccount.getBalance()) {
//				maxAccount = accounts[i];
//			}
//		}
//		return maxAccount;
//	}

	private static double findSumOfAccountBalance(Account[] accounts) {
		double sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i].getBalance();
		}
		return sum;
	}

	private static void sortAccountBySalary(Account[] accounts) {
		Account temp = null;
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length; j++) {
				if (accounts[i].getBalance() > accounts[j].getBalance()) {
					temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;

				}
			}
		}
	}

	private static double findSumOfAccountBalance(Account[] accounts, AccountType type) {
		double sum = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountType().equals(type)) {

				sum += accounts[i].getBalance();
			}
		}
	return sum;
}

	private static Account findHighestBalanceAccount(Account[] accounts) {
		Account maxAccount = accounts[0];

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maxAccount.getBalance()) {
				maxAccount = accounts[i];
			}
		}
		return maxAccount;
	}

	private static Account findHighestBalanceAccountInAccountType(Account[] accounts, AccountType type) {
		Account maxAccount = null;

		for (int i = 0; i < accounts.length; i++) {
			if (maxAccount == null && accounts[i].getAccountType().equals(type)) {
				maxAccount = accounts[i];
			}
			if (maxAccount != null) {
				if (accounts[i].getBalance() > maxAccount.getBalance() && accounts[i].getAccountType().equals(type)) {
					maxAccount = accounts[i];
				}
			}
		}

		return maxAccount;
	}
}

	

