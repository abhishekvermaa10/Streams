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
public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---MIN---");
		Stream<Employee> stream = employeeList.stream();
		Optional<Employee> result = stream.min((employee1, employee2) -> employee1.getMarks() - employee2.getMarks());
		result.ifPresent(System.out::println);

		System.out.println("---MAX---");
		Stream<Employee> stream2 = employeeList.stream();
		Optional<Employee> result2 = stream2.max((employee1, employee2) -> employee1.getMarks() - employee2.getMarks());
		result2.ifPresent(System.out::println);
	}
}