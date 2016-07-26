package com.sapient.day4;

import java.util.Comparator;

import com.sapient.day5.Employee;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary.compareTo(o2.salary);
	}

}
