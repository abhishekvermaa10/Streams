package com.scaleupindia;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		employeeList.forEach(System.out::println);
		System.out.println("----------");
		employeeList.stream().filter(employee -> employee.getMarks() >= 60)
				.sorted((employee1, employee2) -> employee2.getName().compareTo(employee1.getName()))
				.forEach(System.out::println);
	}
}