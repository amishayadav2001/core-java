package com.aurionpro.test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Set<Account> objectSet = new HashSet<>();
		objectSet.add(new Account(11, "Amisha", 10000));
		objectSet.add(new Account(12, "Suraj", 10000));
		objectSet.add(new Account(13, "Nikhil", 10000));
		objectSet.add(new Account(14, "Amisha", 10000));
		objectSet.add(new Account(15, "Amisha", 10000));
		
		System.out.println(objectSet);
		
		

	}

}
