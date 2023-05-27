package com.scaleupindia;

import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo6 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---FILTER---");
		//Create a stream from given list
		//Sort employees by marks in ascending order
		//Get employees with marks more than 50
		//Print the employees
		employeeList.stream()
		.sorted((o1, o2) -> o1.getMarks() - o2.getMarks())
		.filter(employee -> employee.getMarks() > 50)
		.forEach(System.out::println);

		System.out.println("---DROP WHILE---");
		//Create a stream from given list
		//Sort employees by marks in ascending order
		//Get employees with marks more than 50
		//Print the employees
		employeeList.stream()
		.sorted((o1, o2) -> o1.getMarks() - o2.getMarks())
		.dropWhile(employee -> employee.getMarks() <= 50)
		.forEach(System.out::println);

		System.out.println("---TAKE WHILE---");
		//Create a stream from given list
		//Sort employees by marks in descending order
		//Get employees with marks more than 50
		//Print the employees
		employeeList.stream()
		.sorted((o1, o2) -> o2.getMarks() - o1.getMarks())
		.takeWhile(employee -> employee.getMarks() > 50)
		.forEach(System.out::println);
	}
}