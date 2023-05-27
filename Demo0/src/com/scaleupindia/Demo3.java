package com.scaleupindia;

import java.util.ArrayList;
import java.util.Collections;
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
		System.out.println("---INPUT---");
		employeeList.forEach(System.out::println);

		System.out.println("---OUTPUT---");
		// Perform below tasks using Lambda and Method Reference but without using Stream
		// Filter only those employees whose marks are more than equal to 60
		// Sort these employees on ascending order of their names
		// Print these employees
		List<Employee> filteredList = new ArrayList<>();
		employeeList.forEach(employee -> {
			if (employee.getMarks() >= 60) {
				filteredList.add(employee);
			}
		});
		Collections.sort(filteredList, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		filteredList.forEach(System.out::println);
	}
}