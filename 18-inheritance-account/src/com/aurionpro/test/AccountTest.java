package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		
		SavingAccount saving = new SavingAccount(11, "Amisha", 30000);
		System.out.println(saving);
		printTransactionMessage(saving.deposit(1000));
		System.out.println("-------------------");
		
		CurrentAccount current = new CurrentAccount(12, "Nikita", 40000);
		System.out.println(saving);
		printTransactionMessage(saving.withdraw(1000));
		
	}
	
	private static void printTransactionMessage(boolean transaction) {
		if(transaction) {
			System.out.println("Transaction successful...");
			
		}
		else {
			System.out.println("Transaction failed...");
		}

	}

}
