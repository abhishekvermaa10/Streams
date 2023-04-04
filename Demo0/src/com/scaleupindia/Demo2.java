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
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		employeeList.forEach(employee -> System.out.println(employee));
		System.out.println("----------");
		List<Employee> employeeList2 = new ArrayList<>();
		for (Employee employee : employeeList) {
			if (employee.getMarks() >= 60)
				employeeList2.add(employee);
		}
		Collections.sort(employeeList2, (employee1, employee2) -> employee2.getName().compareTo(employee1.getName()));
		employeeList2.forEach(System.out::println);
	}
}