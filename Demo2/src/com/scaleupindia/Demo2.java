package com.scaleupindia;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---FILTER---");
		//Create a stream from given list
		//Filter employees with marks more than equal to 60
		//Print the employees
		employeeList.stream()
		.filter(employee -> employee.getMarks() >= 60)
		.forEach(System.out::println);
	}
}