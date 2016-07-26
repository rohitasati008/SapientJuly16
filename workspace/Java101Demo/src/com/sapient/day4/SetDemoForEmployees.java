package com.sapient.day4;

import java.util.HashSet;
import java.util.Set;

import com.sapient.day5.Employee;

public class SetDemoForEmployees {

	public static void main(String[] args) {
		Employee e1 = new Employee(23,"Ravi", "Kumar", 12232.0);
		Employee e2 = new Employee(12,"Amit", "Kumar", 62232.0);
		Employee e21 = new Employee(12,"Amit", "Arya", 45466.3);
		Employee e3 = new Employee(3,"Sankaran", "Kumar", 22232.0);
		Employee e4 = new Employee(45,"Priya", "Kumar", 82232.0);
		
		Set<Employee> employees = new HashSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e21);
		employees.add(e3);
		employees.add(e4);
		
		Employee searchEmployee = new Employee(3,"Sankaran", "Kumar", 22232.0);
		System.out.println(employees.contains(searchEmployee));
		
		
		
		
		
		
		
		
		
		
		
	}

}
