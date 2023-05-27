package com.scaleupindia;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---GROUP BY---");
		// Create a stream from given list
		// Group employees by employeeId
		// Print the data of group
		Map<Integer, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.toList()));
		map.entrySet().forEach(System.out::println);

		System.out.println("---PARTITION BY---");
		// Create a stream from given list
		// Group employees by marks more than equal to 60 and less than 60
		// Print the data of group
		Map<Boolean, List<Employee>> map2 = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getMarks() >= 60, Collectors.toList()));
		map2.entrySet().forEach(System.out::println);
	}
}