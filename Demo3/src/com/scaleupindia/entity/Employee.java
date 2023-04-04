package com.scaleupindia.entity;

import java.util.Objects;

/**
 * @author abhishekvermaa10
 *
 */
public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int marks;

	public Employee(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}