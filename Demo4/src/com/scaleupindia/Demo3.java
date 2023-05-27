package com.scaleupindia;

import java.util.List;
import java.util.Optional;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---REDUCE---");
		// Create a stream from given list
		// Get the marks of employees
		// Add all the marks
		// Print the sum of marks
		Optional<Integer> optional1 = employeeList.stream().map(employee -> employee.getMarks())
				.reduce((marks1, marks2) -> marks1 + marks2);
		System.out.println(optional1);

		System.out.println("---REDUCE WITH SEED---");
		// Create a stream from given list
		// Get the marks of employees
		// Add all the marks to 1000
		// Print the sum of marks
		Integer optional2 = employeeList.stream().map(employee -> employee.getMarks())
				.reduce(1000, (marks1, marks2) -> marks1 + marks2);
		System.out.println(optional2);
	}
}