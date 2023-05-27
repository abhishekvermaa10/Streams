package com.scaleupindia;

import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---INPUT---");
		employeeList.forEach(System.out::println);

		System.out.println("---OUTPUT---");
		// Perform below tasks using Lambda, Method Reference and Stream
		// Create stream of employees from given list
		// Filter only those employees whose marks are more than equal to 60
		// Sort these employees on ascending order of their names
		// Print these employees
		Stream<Employee> employeeStream = employeeList.stream();
		Stream<Employee> filteredStream = employeeStream.filter(employee -> employee.getMarks() >= 60);
		Stream<Employee> sortedStream = filteredStream.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));
		sortedStream.forEach(System.out::println);
	}
}