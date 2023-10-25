package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import com.aurionpro.model.Account;
import com.aurionpro.model.GenderType;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(
				new Account(1, "Amisha", 1000000, GenderType.MALE),
				new Account(1, "Reena", 2000000, GenderType.FEMALE), 
				new Account(1, "Jay", 30000, GenderType.MALE),
				new Account(1, "Rohan", 40000, GenderType.FEMALE), 
				new Account(1, "Suraj", 500000, GenderType.MALE),
				new Account(1, "Swati", 60000, GenderType.FEMALE), 
				new Account(1, "Nikki", 70000, GenderType.MALE),
				new Account(1, "Jyoti", 80000, GenderType.FEMALE), 
				new Account(1, "Amir", 90000, GenderType.MALE),
				new Account(1, "Aaru", 100000, GenderType.FEMALE)
				);

		List<Account> highBalanceAccounts = accounts.stream()
				.filter((account) -> account.getBalance() >+ 100000)
				.collect(Collectors.toList());

		System.out.println("Account with balance greater than 1L:");
		highBalanceAccounts.forEach(System.out::println);

		
		List<Account> maleAccounts = accounts.stream()
				.filter((account) -> account.getGenderType().equals (GenderType.MALE))
				.collect(Collectors.toList());
		
		System.out.println("\nMale Accounts:");
		maleAccounts.forEach(System.out::println);


		List<Account> femaleAccounts = accounts.stream()
				.filter((account) -> account.getGenderType().equals (GenderType.FEMALE))
				.collect(Collectors.toList());
		
		System.out.println("\nFemale Accounts:");
		femaleAccounts.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
		
		List<Double> balanceList = accounts.stream()
		.map((account)->account.getBalance())
		.collect(Collectors.toList());
		
		balanceList.forEach(System.out::println);
		
		List<Account> sortedByBalance = accounts.stream()
		.sorted(Comparator.comparingDouble(Account::getBalance).reversed())
		.limit(3)
		.collect(Collectors.toList());
		
		sortedByBalance.forEach(System.out::println);
		
			
	}
}



