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
public class Demo {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		System.out.println("----------");
		List<Employee> employeeList2 = new ArrayList<>();
		for (Employee employee : employeeList) {
			if (employee.getMarks() >= 60)
				employeeList2.add(employee);
		}
		Collections.sort(employeeList2, new Comparator<>() {
			@Override
			public int compare(Employee employee1, Employee employee2) {
				return employee2.getName().compareTo(employee1.getName());
			}
		});
		for (Employee employee : employeeList2) {
			System.out.println(employee);
		}
	}
}