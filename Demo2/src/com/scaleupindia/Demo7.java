package com.scaleupindia;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo7 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---MAP---");
		// Create a stream from given list
		// Get name of employees
		// Print the name of employees
		employeeList.stream()
		.map(Employee::getName)
		.forEach(System.out::println);

		System.out.println("---FLAT MAP---");
		// Create a stream from multiple lists
		// Get name of employees
		// Print the name of employees
		List<Employee> employeeList2 = GeneratorUtil.populateEmployees2();
		Stream<List<Employee>> stream = Stream.of(employeeList, employeeList2);
		stream.flatMap(Collection::stream)
		.map(Employee::getName)
		.forEach(System.out::println);
	}
}