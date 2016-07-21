package com.sapient.day2.inheritance;

public class TestEmployees {

	public static void main(String[] args) {

		RegularEmployee r1 = new RegularEmployee(1, "Ravi", 24233, 2);
		RegularEmployee r2 = new RegularEmployee(2, "Raj", 24234);
		
		ContractualEmployee c1 = new ContractualEmployee(3, "Nishant", 35353);
		ContractualEmployee c2 = new ContractualEmployee(4, "Priya", 30000);
		
		Employee employees[] = {r1,r2,c1,c2};
		
		printEmployees(employees);
		
		for(Employee e: employees){
			e.incrementSalary();
		}
		
		printEmployees(employees);
		
		

	}
	
	public static void printEmployees(Employee employees[]){
		for(Employee e: employees){
			System.out.println(e);
		}
	}

}