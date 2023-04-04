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
public class Demo3 {
	public static void main(String[] args) {
		List<Employee> employeeList = GeneratorUtil.populateEmployees();
		Stream<Employee> stream = employeeList.stream();
		long start = System.currentTimeMillis();
		Stream<Employee> filteredStream = stream.peek(employee -> LogUtil.logWithSleep("Pre Filter  : " + employee))
				.filter(employee -> {
					LogUtil.logWithSleep("Filtering   : " + employee);
					return employee.getMarks() >= 60;
				}).peek(employee -> LogUtil.logWithSleep("Post Filter : " + employee));

		LogUtil.logWithSleep("---STREAM---");
		LogUtil.logWithSleep("Count : " + filteredStream.count());
		System.out.println(System.currentTimeMillis() - start + " milliseconds without sleep");
	}
}