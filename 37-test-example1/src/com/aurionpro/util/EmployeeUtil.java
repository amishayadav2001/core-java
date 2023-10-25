package com.aurionpro.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeUtil {

	List<Employee> employeeList;
	private static boolean initialLoad = checkIfFileEmpty();

	public EmployeeUtil() {
		this.employeeList = new ArrayList<>();
		loadEmployee();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	private void loadEmployee() {
		if (initialLoad) {
			employeeList = new EmployeeReader().readEmployeeFromFile("C:\\Users\\amisha.yadav\\Downloads\\emp (3).txt");
			initialLoad = true;
		} else {
			try {
				FileInputStream file = new FileInputStream("C:\\Users\\amisha.yadav\\Desktop\\serializedemployee.txt");
				ObjectInputStream in = new ObjectInputStream(file);

				this.employeeList = (List<Employee>) in.readObject();

				in.close();
				file.close();

				System.out.println("Object de-serialized successfully");

			} catch (ClassNotFoundException | FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		saveEmployeeList();
	}

	public void removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			saveEmployeeList();
		}
	}

	private void saveEmployeeList() {
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\amisha.yadav\\Desktop\\serializedemployee.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeList);

			out.close();
			file.close();

			System.out.println("Object serialized successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean checkIfFileEmpty() {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\amisha.yadav\\Desktop\\serializedemployee.txt");
			if (file.read() != -1) {
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	public void allEmployeesDepartment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department Id: ");
		int departmentId = sc.nextInt();

		List<Employee> employeesInDepartment = employeeList.stream().filter(emp -> emp.getId() == departmentId)
				.collect(Collectors.toList());

		System.out.println("Employees in Department " + departmentId + ":");
		employeesInDepartment.forEach(System.out::println);
	}

	public void countOfEmployees() {
		Map<Integer, Long> departmentEmployeeCount = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.counting()));

		departmentEmployeeCount
				.forEach((department, count) -> System.out.println("Department " + department + ": " + count));
	}

	public void sumOfsalaryOfAllEmployees() {
		Double sum = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Sum of All Salaries of all employees: " + sum);
	}

	public void salesmanWithHighestCommission() {
		Optional<Employee> employeeWithHighestCommission = employeeList.stream()
				.max(Comparator.comparingDouble(Employee::getCommission));

		if (employeeWithHighestCommission.isPresent()) {
			Employee highestCommissionSalesman = employeeWithHighestCommission.get();
			System.out.println("Salesman with the highest commission:");
			System.out.println(highestCommissionSalesman);
		} else {
			System.out.println("No salesman found ");
		}

	}

	public void highestPaidEmployeesInEachDepartment() {
		Map<Integer, Optional<Employee>> highestPaidEmployeesInEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId,
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		System.out.println("Highest Paid Employees in Each Department:");

		highestPaidEmployeesInEachDepartment.forEach((department, employee) -> {
			if (employee.isPresent()) {
				System.out.println("Department " + department + ":");
				System.out.println(employee.get());
			} else {
				System.out.println("No employee found in Department " + department);
			}
		});

	}

	public void highestPaidEmployeeInEachRole() {
		Map<String, Employee> highestPaidEmployeesInRole = new HashMap<>();

		for (Employee employee : employeeList) {
			String role = employee.getRole();
			double salary = employee.getSalary();

			if (!highestPaidEmployeesInRole.containsKey(role)
					|| salary > highestPaidEmployeesInRole.get(role).getSalary()) {
				highestPaidEmployeesInRole.put(role, employee);
			}
		}

		System.out.println("Highest Paid Employee in Each Role:");

		highestPaidEmployeesInRole.forEach((role, employee) -> {
			System.out.println("Role: " + role);
			System.out.println(employee);
		});
	}

	public Optional<Employee> findImmediateManagerById(int employeeId) {
		Optional<Employee> employee = employeeList.stream().filter(e -> e.getId() == employeeId).findFirst();

		if (employee.isPresent()) {
			int managerId = employee.get().getManagerId();

			Optional<Employee> manager = employeeList.stream().filter(e -> e.getId() == managerId).findFirst();

			return manager;
		} else {
			return Optional.empty();
		}
	}



	public void employeesJoinedBetweenTwoDates(int year1, int month1, int day1, int year2, int month2, int day2) {
	    String date1 = year1 + "-" + month1 + "-" + day1;
	    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    LocalDate dateTime1 = LocalDate.parse(date1, formatter1);

	    String date2 = year2 + "-" + month2 + "-" + day2;
	    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    LocalDate dateTime2 = LocalDate.parse(date2, formatter2);

	    System.out.println("From: " + dateTime1);
	    System.out.println("To: " + dateTime2);

	    List<Employee> employeesJoined = employeeList.stream()
	            .filter(emp -> emp.getDateOfJoining().isAfter(dateTime1) && emp.getDateOfJoining().isBefore(dateTime2))
	            .collect(Collectors.toList());

	    if (employeesJoined.isEmpty()) {
	        System.out.println("No employees found between the following two dates");
	    } else {
	        employeesJoined.forEach(System.out::println);
	    }
	}


}
