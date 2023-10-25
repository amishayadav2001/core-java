package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee(11, "Amisha", 11000, 33000, 444000, 666000);
		employee.printSalarySlip();

	}

}
