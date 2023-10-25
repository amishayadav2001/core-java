package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest {
	    public static void main(String[] args) {
	    	List<Account> accounts = Arrays.asList(
	        new Account(1, "Amisha", 15000),
	        new Account(2, "Suraj", 25000),
	        new Account(3, "Akanksha", 18000),
	        new Account(4, "Nikhil", 30000),
	        new Account(5, "Riya", 12000));

	        Account minBalanceAccount = accounts.stream()
	                                           .min(Comparator.comparingDouble(Account::getBalance))
	                                           .orElse(null);
	        System.out.println("Account with minimum balance: " + minBalanceAccount);
	        
	        System.out.println("---------------------------------------------------------------");

	        Account maxBalanceAccount = accounts.stream()
	                                           .max(Comparator.comparingDouble(Account::getBalance))
	                                           .orElse(null);
	        System.out.println("Account with maximum balance: " + maxBalanceAccount);
	        
	        System.out.println("---------------------------------------------------------------");

	        System.out.println("Account names greater than 6 characters:");
	        accounts.stream()
	                .filter(account -> account.getName().length() > 6)
	                .forEach(account -> System.out.println(account.getName()));
	        
	        System.out.println("---------------------------------------------------------------");

	        double totalBalance = accounts.stream()
	        		.collect(Collectors.summingDouble(Account::getBalance));                            
	        System.out.println("Total balance of all accounts: " + totalBalance);
	    }
	}


