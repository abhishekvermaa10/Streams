package com.scaleupindia;

import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		employeeList.forEach(System.out::println);
		System.out.println("----------");
		Stream<Employee> employeeStream = employeeList.stream();
		Stream<Employee> filteredStream = employeeStream.filter(employee -> employee.getMarks() >= 60);
		Stream<Employee> sortedStream = filteredStream
				.sorted((employee1, employee2) -> employee2.getName().compareTo(employee1.getName()));
		sortedStream.forEach(System.out::println);
	}
}