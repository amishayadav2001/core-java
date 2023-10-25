package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee(11, "Amisha", 100000, "Developer"),
				new Employee(13, "Suraj", 200000, "Admin"), 
				new Employee(19, "Nikhil", 300000, "HR"),
				new Employee(33, "Vikram", 400000, "Developer"), 
				new Employee(44, "Riya", 500000, "IT"),
				new Employee(66, "Priya", 600000, "IT"));

		Map<String, List<Employee>> distDepartment = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		distDepartment.forEach((key, value) -> {
			System.out.println(key + " : " + value);
		});

		System.out.println("------------------------------------------------------");
		//
		// Double sum = employees.stream()
		// .collect(Collectors.summingDouble(Employee::getSalary));
		//
		// System.out.println(sum);
		//
		Double sum = employees.stream()
				.map(employee -> employee.getSalary())
				.reduce(0.0, (a, b) -> a + b);
		
		System.out.println(sum);
		
		System.out.println("------------------------------------------------------");
		
		Optional<Employee> min = employees.stream()
				.min(Comparator.comparingDouble(Employee::getSalary));
		
		if(min.isPresent()) {
			System.out.println(min.get());
		}
		else {
			System.out.println("No result found");
		}
		
		System.out.println("------------------------------------------------------");
//		
//		Optional<Employee> maxSalary = employees.stream()
//				.max(Comparator.comparingDouble(Employee::getSalary));
//		System.out.println(maxSalary);
		
		Optional<Employee> max = employees.stream()
		.max(Comparator.comparingDouble(Employee::getSalary));
		
		if(max.isPresent()) {
			System.out.println(max.get());
		}
		else {
			System.out.println("No result found");
		}
		
//		employees.stream()
//				.filter(emp->emp.getSalary()>500000)
//				.max(Comparator.comparingDouble(Employee::getSalary))
//		        .ifPresent(System.out::println);
//		
	
		System.out.println("------------------------------------------------------");
		
		long countEmp = employees.stream()
				.filter((emp) -> emp.getSalary()>=50000)
				.count();
		System.out.println(countEmp);
				
		
	
	}

}
