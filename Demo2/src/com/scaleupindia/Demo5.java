package com.scaleupindia;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---SORT 1---");
		Stream<Employee> stream = employeeList.stream();
		Stream<Employee> sortedStream = stream.sorted();
		sortedStream.forEach(System.out::println);

		System.out.println("---SORT 2---");
		Stream<Employee> stream2 = employeeList.stream();
		Stream<Employee> sortedStream2 = stream2
				.sorted((employee1, employee2) -> employee1.getMarks() - employee2.getMarks());
		sortedStream2.forEach(System.out::println);

		System.out.println("---SORT 3---");
		Stream<Employee> stream3 = employeeList.stream();
		Stream<Employee> sortedStream3 = stream3.sorted(Comparator.reverseOrder());
		sortedStream3.forEach(System.out::println);
	}
}