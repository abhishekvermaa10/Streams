package com.scaleupindia;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---ALL MATCH---");
		//Create a stream from given list
		//Print true if all employees have marks more than 60, else false
		//Print the number of employees
		boolean result = employeeList.stream().allMatch(employee -> employee.getMarks() > 60);
		System.out.println(result);

		System.out.println("---ANY MATCH---");
		//Create a stream from given list
		//Print true if at least 1 employee have marks more than 60, else false
		//Print the number of employees
		boolean result2 = employeeList.stream().anyMatch(employee -> employee.getMarks() > 60);
		System.out.println(result2);

		System.out.println("---NONE MATCH---");
		//Create a stream from given list
		//Print true if no employee have marks more than 60, else false
		//Print the number of employees
		boolean result3 = employeeList.stream().noneMatch(employee -> employee.getMarks() > 60);
		System.out.println(result3);
	}
}