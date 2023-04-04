package com.scaleupindia;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
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
		System.out.println("---COLLECT TO LIST---");
		Stream<Employee> stream = employeeList.stream();
		List<Employee> list = stream.collect(Collectors.toList());
		list.forEach(System.out::println);

		System.out.println("---COLLECT TO SET---");
		Stream<Employee> stream2 = employeeList.stream();
		Set<Employee> set = stream2.collect(Collectors.toSet());
		set.forEach(System.out::println);

		System.out.println("---COLLECT TO MAP---");
		Stream<Employee> stream3 = employeeList.stream();
		Map<Integer, Employee> map = stream3
				.collect(Collectors.toMap(Employee::getId, employee -> employee, (employee1, employee2) -> employee2));
		map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}
}