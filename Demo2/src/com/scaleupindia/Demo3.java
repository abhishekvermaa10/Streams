package com.scaleupindia;

import java.util.List;
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
		System.out.println("---SKIP---");
		Stream<Employee> stream = employeeList.stream();
		Stream<Employee> skippedStream = stream.skip(2);
		skippedStream.forEach(System.out::println);
		
		System.out.println("---LIMIT---");
		Stream<Employee> stream2 = employeeList.stream();
		Stream<Employee> limitedStream = stream2.limit(2);
		limitedStream.forEach(System.out::println);
	}
}