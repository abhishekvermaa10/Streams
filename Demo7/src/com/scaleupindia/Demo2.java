package com.scaleupindia;

import java.util.List;
import java.util.stream.Stream;

import com.scaleupindia.entity.Employee;
import com.scaleupindia.utility.GeneratorUtil;
import com.scaleupindia.utility.LogUtil;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		// Create a parallel stream from given list
		// Filter employees by marks more than equal to 60
		// Print the number of filtered employees
		// Print employee before filtering, during filtering and after filtering using LogUtil.logWithoutSleep()
		Stream<Employee> stream = employeeList.parallelStream();
		long start = System.currentTimeMillis();
		Stream<Employee> filteredStream = stream
				.peek(employee -> LogUtil.logWithoutSleep("Pre Filter  : " + employee))
				.filter(employee -> {
					LogUtil.logWithoutSleep("Filtering   : " + employee);
					return employee.getMarks() >= 60;
				})
				.peek(employee -> LogUtil.logWithoutSleep("Post Filter : " + employee));
		
		LogUtil.logWithoutSleep("---PARALLEL STREAM---");
		LogUtil.logWithoutSleep("Count : " + filteredStream.count());
		System.out.println(System.currentTimeMillis() - start + " milliseconds without sleep");
	}
}