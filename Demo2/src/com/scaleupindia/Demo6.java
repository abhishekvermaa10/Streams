package com.scaleupindia;

import java.util.Collection;
import java.util.List;
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
		System.out.println("---MAP---");
		Stream<Employee> stream = employeeList.stream();
		Stream<String> mappedStream = stream.map(employee -> employee.getName().toUpperCase());
		mappedStream.forEach(System.out::println);

		System.out.println("---FLAT MAP---");
		List<Employee> employeeList2 = GeneratorUtil.populateEmployees2();
		Stream<List<Employee>> stream2 = Stream.of(employeeList, employeeList2);
		Stream<Employee> flatMappedStream = stream2.flatMap(Collection::stream);
		Stream<String> mappedStream2 = flatMappedStream.map(employee -> employee.getName().toUpperCase());
		mappedStream2.forEach(System.out::println);
	}
}