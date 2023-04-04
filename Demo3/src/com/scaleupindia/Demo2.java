package com.scaleupindia;

import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---COUNT---");
		Stream<Employee> stream = employeeList.stream();
		long result = stream.count();
		System.out.println(result);
	}
}