package com.sapient.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(23,"Ravi", "Kumar", 12232.0);
		Employee e2 = new Employee(12,"Amit", "Kumar", 62232.0);
		Employee e21 = new Employee(12,"Amit", "Arya", 45466.3);
		Employee e3 = new Employee(3,"Sankaran", "Kumar", 22232.0);
		Employee e4 = new Employee(45,"Priya", "Kumar", 82232.0);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e21);
		employees.add(e3);
		employees.add(e4);
		
		/*employees.add(3);
		employees.add(new Integer(3));
		*/
		System.out.println(employees);
		
//		Collections.sort(employees);
		Collections.sort(employees, new SalaryComparator());
		Collections.sort(employees, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		System.out.println(employees);
	
		
		
		System.out.println(e1.compareTo(e2));
		
		
		
	}

}