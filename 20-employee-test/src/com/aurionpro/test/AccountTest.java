package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.Manager;

public class AccountTest {

	public static void main(String[] args) {
		
		Manager manager = new Manager(101, "Amisha", 2000);
		printSalary(manager);
		
		Developer developer = new Developer(102, "Kritika", 5000);
		printSalary(developer);
		
		Accountant accountant = new Accountant(103, "Yakshatha", 4000);
		printSalary(accountant);

	}
	
	public static void printSalary(Employee employee) {
		System.out.println(employee);
		System.out.println("Annual Salary: " + employee.calculateAnnualCTC() + "\n");
	}

}

