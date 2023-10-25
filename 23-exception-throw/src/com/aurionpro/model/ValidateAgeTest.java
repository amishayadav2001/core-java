package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exception.InvalidAgeException;
import com.aurionpro.util.AgeUtil;

public class ValidateAgeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user age: ");
		int age = sc.nextInt();
		try {

			AgeUtil.validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
