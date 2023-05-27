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
		System.out.println("---DISTINCT---");
		//Create a stream from given list
		//Filter distinct employees
		//Print the employees
		employeeList.stream().distinct().forEach(System.out::println);
	}
}