package com.sapient.day5;

import java.util.ArrayList;
import java.util.List;

public class TestComposition {

	
	public static void main(String[] args) {
		Address add1 = new Address(123, "GJ");
		Address add2 = new Address(4123, "KJds");
		
		List<Address> addresses = new ArrayList<>();
		addresses.add(add1);
		addresses.add(add2);
		
		Employee emp = new Employee(23, "Ravi" , 34534.4, addresses);
//		emp.setAddresses(addresses);
		
		System.out.println(emp);
	}
}
