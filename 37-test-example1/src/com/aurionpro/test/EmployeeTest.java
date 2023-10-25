package com.aurionpro.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.aurionpro.model.Employee;
import com.aurionpro.util.EmployeeUtil;

public class EmployeeTest {

	static int count = 0;

	public static void main(String[] args) {

		EmployeeUtil employeeUtil = new EmployeeUtil();

		System.out.println(employeeUtil.getEmployeeList());
		employeeUtil.addEmployee(new Employee(8011, "Amisha", "Manager", 2000, 8011, 0, 30));
		System.out.println("---------------------------------------------------------");
		System.out.println(employeeUtil.getEmployeeList());

		System.out.println("---------------------------------------------------------");
		System.out.println("All employees in a department");
		employeeUtil.allEmployeesDepartment();

		System.out.println("---------------------------------------------------------");
		System.out.println("Count of employees in each department: ");
		employeeUtil.countOfEmployees();

		System.out.println("---------------------------------------------------------");
		employeeUtil.sumOfsalaryOfAllEmployees();

		System.out.println("---------------------------------------------------------");
		employeeUtil.salesmanWithHighestCommission();

		System.out.println("---------------------------------------------------------");
		employeeUtil.highestPaidEmployeesInEachDepartment();

		System.out.println("---------------------------------------------------------");
		employeeUtil.highestPaidEmployeeInEachRole();

		System.out.println("---------------------------------------------------------");
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		int employeeId = sc.nextInt();

		Optional<Employee> immediateManagerOptional = employeeUtil.findImmediateManagerById(employeeId);

		if (immediateManagerOptional.isPresent()) {
			Employee immediateManager = immediateManagerOptional.get();
			System.out.println("Immediate Manager: " + immediateManager.getName());
		} else {
			System.out.println("Employee not found or no immediate manager.");
		}

		System.out.println("---------------------------------------------------------");
		employeeUtil.employeesJoinedBetweenTwoDates(2023,11,11,2023,11,13);
		
	}

}

