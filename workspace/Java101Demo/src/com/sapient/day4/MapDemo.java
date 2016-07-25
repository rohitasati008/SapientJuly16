package com.sapient.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(23,"Ravi", "Kumar", 12232.0);
		Employee e2 = new Employee(12,"Amit", "Kumar", 62232.0);
		
		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(23, e1);
		employeeMap.put(12, e2);
		employeeMap.put(12, e2);
		
		Set<Integer> employeeSet = employeeMap.keySet();
		
		System.out.println(employeeSet);
		
		
		for(Integer key : employeeSet){
			System.out.println(employeeMap.get(key));
			Employee emp = employeeMap.get(key);
			System.out.println(emp);
		}
		
		System.out.println(employeeMap);
		
		System.out.println(employeeMap.get(23));
		

			/*Map<Long, String> employeeMap = new HashMap<>();
			
			employeeMap.put(9999888333l, "Ravi");
			employeeMap.put(9999888444l, "Arun");
			
			System.out.println(employeeMap);*/

	}

}
