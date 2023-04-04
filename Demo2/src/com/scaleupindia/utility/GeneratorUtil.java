package com.scaleupindia.utility;

import java.util.ArrayList;
import java.util.List;

import com.scaleupindia.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public class GeneratorUtil {
	public static List<Employee> populateEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", 60));
		employeeList.add(new Employee(177, "Sneh", 55));
		employeeList.add(new Employee(129, "John", 20));
		employeeList.add(new Employee(101, "Abhishek", 50));
		employeeList.add(new Employee(153, "Robert", 44));
		employeeList.add(new Employee(102, "Elisa", 90));
		return employeeList;
	}

	public static List<Employee> populateEmployees2() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(229, "Ron", 10));
		employeeList.add(new Employee(201, "Tom", 20));
		employeeList.add(new Employee(253, "Harry", 24));
		employeeList.add(new Employee(202, "Donald", 60));
		return employeeList;
	}
}