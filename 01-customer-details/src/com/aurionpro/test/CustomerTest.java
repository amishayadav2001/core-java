package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomerTest {
	public static void main(String[] args) {
		Customer[] customers = new Customer[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < customers.length; i++) {
			System.out.println("Enter details for Customer " + (i + 1) + ":");

			System.out.print("Customer ID: ");
			int custId = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			String email;
			while (true) {
				System.out.print("Email: ");
				email = sc.nextLine();
				if (isValidEmail(email)) {
					break;
				} else {
					System.out.println("Invalid email. Please enter a valid email address.");
				}
			}

			System.out.print("Password: ");
			String password = sc.nextLine();

			customers[i] = new Customer(custId, name, email, password);
		}

		System.out.println("\nCustomer List:");

		Arrays.sort(customers, Comparator.comparing(Customer::getName));

		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	private static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return email.matches(emailRegex);
	}

}
