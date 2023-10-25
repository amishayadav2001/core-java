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
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
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

	public void deposit(double amount) {
		this.balance += amount;
	}

	public boolean withdraw(double amount) {

		if (accountType.equals(AccountType.SAVINGS)) {
			if (balance - amount > 0) {
				this.balance -= amount;
				return true;
			}
			return false;
		} else {
			if (balance - amount > -25000) {
				this.balance -= amount;
				return true;
			}
			return false;

		}
	}

	@Override
	public String toString() {
		return "\nAccount [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
	}

}


//package com.aurionpro.model;
//
//public class Account {
//	private int id;
//	private String name;
//	private double balance;
//	private AccountType accountType;
//	private static int count;
//
//	public Account(int id, String name, double balance, AccountType accountType) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.balance = balance;
//		this.accountType = accountType;
//		count++;
//	}
//	
//	public Account() {
//		count++;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public void setAccountType(AccountType accountType) {
//		this.accountType = accountType;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public AccountType getAccountType() {
//		return accountType;
//	}
//
//	public void deposit(double amount) {
//		this.balance += amount;
//	}
//
//	public boolean withdraw(double amount) {
//
//		if (accountType.equals(AccountType.SAVINGS)) {
//			if (balance - amount > 0) {
//				this.balance -= amount;
//				return true;
//			}
//			return false;
//		} else {
//			if (balance - amount > -25000) {
//				this.balance -= amount;
//				return true;
//			}
//			return false;
//
//		}
//	}
//
//	@Override
//	public String toString() {
//		return "\nAccount [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
//	}
//
//	public static int getCount() {
//		return count;
//	}
//
//}
//
