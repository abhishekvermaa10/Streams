package com.scaleupindia;

import java.util.Comparator;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---SORT 1---");
		// Create a stream from given list
		// Sort employees in natural order
		// Print the employees
		employeeList.stream().sorted().forEach(System.out::println);

		System.out.println("---SORT 2---");
		// Create a stream from given list
		// Sort employees by marks in ascending order
		// Print the employees
		employeeList.stream().sorted((o1, o2) -> o1.getMarks() - o2.getMarks()).forEach(System.out::println);

		System.out.println("---SORT 3---");
		// Create a stream from given list
		// Sort employees in reverse order
		// Print the employees
		employeeList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}