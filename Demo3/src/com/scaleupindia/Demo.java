package com.scaleupindia;

import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---ITERATE---");
		Stream<Employee> stream = employeeList.stream();
		stream.forEach(System.out::println);
	}
}