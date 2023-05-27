package com.scaleupindia;

import java.util.List;
import java.util.Optional;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		// Create a stream from given list
		// Filter employees by marks more than equal to 60
		// Print the first filtered employee
		// Print employee before filtering, during filtering and after filtering
		Optional<Employee> optional = employeeList.stream()
				.peek(employee -> System.out.println("Pre Filtering : " + employee))
				.filter(employee -> {
					System.out.println("Filtering : " + employee);
					return employee.getMarks() >= 60;
				})
				.peek(employee -> System.out.println("Post Filtering : " + employee))
				.findFirst();
		System.out.println(optional);
	}
}