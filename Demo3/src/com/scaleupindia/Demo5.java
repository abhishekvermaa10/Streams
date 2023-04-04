package com.scaleupindia;

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
		System.out.println("---ALL MATCH---");
		Stream<Employee> stream = employeeList.stream();
		boolean result = stream.allMatch(employee -> employee.getMarks() > 60);
		System.out.println(result);

		System.out.println("---ANY MATCH---");
		Stream<Employee> stream2 = employeeList.stream();
		boolean result2 = stream2.anyMatch(employee -> employee.getMarks() > 60);
		System.out.println(result2);

		System.out.println("---NONE MATCH---");
		Stream<Employee> stream3 = employeeList.stream();
		boolean result3 = stream3.noneMatch(employee -> employee.getMarks() > 60);
		System.out.println(result3);
	}
}