package com.scaleupindia;

import java.util.List;
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
		System.out.println("---PEEK---");
		Stream<Employee> stream = employeeList.stream();
		Stream<Employee> peekedStream = stream.peek(System.out::println);
		Stream<Employee> filteredStream = peekedStream.filter(employee -> employee.getMarks() > 0);
		long result = filteredStream.count();
		System.out.println(result);

		System.out.println("---PEEK 2---");
		Stream<Employee> stream2 = employeeList.stream();
		Stream<Employee> peekedStream2 = stream2.peek(System.out::println);
		long result2 = peekedStream2.count();
		System.out.println(result2);
	}
}