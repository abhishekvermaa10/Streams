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
public class Demo6 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---REDUCE---");
		Stream<Employee> stream = employeeList.stream();
		Stream<Integer> marksStream = stream.map(Employee::getMarks);
		Optional<Integer> result = marksStream.reduce((marks1, marks2) -> marks1 + marks2);
		result.ifPresent(marks -> System.out.println(marks));

		System.out.println("---REDUCE WITH SEED---");
		Stream<Employee> stream2 = employeeList.stream();
		Stream<Integer> marksStream2 = stream2.map(Employee::getMarks);
		Integer result2 = marksStream2.reduce(100, (marks1, marks2) -> marks1 + marks2);
		System.out.println(result2);
	}
}