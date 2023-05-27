package com.scaleupindia.utility;

import java.util.ArrayList;
import java.util.List;

import com.scaleupindia.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public class GeneratorUtil {
	private GeneratorUtil() {

	}

	public static List<Employee> populateEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "Abhishek", 10));
		employeeList.add(new Employee(177, "Sneh", 55));
		employeeList.add(new Employee(129, "John", 60));
		employeeList.add(new Employee(101, "Abhishek", 60));
		employeeList.add(new Employee(153, "Robert", 44));
		employeeList.add(new Employee(102, "Yuvraj", 90));
		return employeeList;
	}
}