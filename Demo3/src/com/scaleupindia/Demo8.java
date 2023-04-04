package com.scaleupindia;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo8 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---GROUP BY---");
		Stream<Employee> stream = employeeList.stream();
		Map<Integer, List<Employee>> map = stream.collect(Collectors.groupingBy(Employee::getId, Collectors.toList()));
		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		System.out.println("---PARTITION BY---");
		Stream<Employee> stream2 = employeeList.stream();
		Map<Boolean, List<Employee>> map2 = stream2
				.collect(Collectors.partitioningBy(employee -> employee.getMarks() >= 60, Collectors.toList()));
		map2.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}