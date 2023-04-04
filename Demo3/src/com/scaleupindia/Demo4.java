package com.scaleupindia;

import java.util.List;
import java.util.Optional;
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
		System.out.println("---FIND ANY---");
		Stream<Employee> stream = employeeList.stream();
		Optional<Employee> result = stream.findAny();
		result.ifPresent(System.out::println);

		System.out.println("---FIND FIRST---");
		Stream<Employee> stream2 = employeeList.stream();
		Optional<Employee> result2 = stream2.findFirst();
		result2.ifPresent(System.out::println);
	}
}