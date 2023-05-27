package com.scaleupindia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		System.out.println("---INPUT---");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}

		System.out.println("---OUTPUT---");
		// Perform below tasks without using Lambda, Method Reference and Stream
		// Filter only those employees whose marks are more than equal to 60
		// Sort these employees on ascending order of their names
		// Print these employees
		List<Employee> filteredList = new ArrayList<>();
		for(Employee employee : employeeList) {
			if(employee.getMarks() >= 60) {
				filteredList.add(employee);
			}
		}
		Collections.sort(filteredList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Employee employee : filteredList) {
			System.out.println(employee);
		}
	}
}