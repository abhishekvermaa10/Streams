package com.scaleupindia;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---COLLECT TO ARRAY---");
		// Create a stream from given list
		// Convert stream to array of Employee
		// Print the data of array
		Employee[] array = employeeList.stream().toArray(Employee[]::new);
		for(Employee employee : array) {
			System.out.println(employee);
		}

		System.out.println("---COLLECT TO LIST---");
		// Create a stream from given list
		// Convert stream to list of Employee
		// Print the data of list
		List<Employee> list = employeeList.stream().collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("---COLLECT TO SET---");
		// Create a stream from given list
		// Convert stream to set of Employee
		// Print the data of set
		Set<Employee> set = employeeList.stream().collect(Collectors.toSet());
		set.forEach(System.out::println);

		System.out.println("---COLLECT TO MAP---");
		// Create a stream from given list
		// Convert stream to map of Employee with key as employeeId
		// Print the data of map
		Map<Integer, Employee> map = employeeList.stream()
				.collect(Collectors.toMap(Employee::getId, employee -> employee, (employee1, employee2) -> employee2));
		map.entrySet().forEach(System.out::println);
	}
}