package com.sapient.day2;

public class TestInheritance {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Ravi", 10000);
		emp.incrementSalary(1.1);
//		System.out.println(emp);
//		printName(emp);
		
		
		Manager manager = new Manager(1, "Arun", 10000);
		Employee e = emp;
		e.incrementSalary(1.2);
		
		
		Employee employees[] = {emp, manager};
		
		Employee e11 = employees[0];
		Employee e22 = employees[1];
		
		for(Employee e1: employees){
			printName(e1);
		}
		
		
//		manager.incrementSalary(1.1);
//		printMangerName(manager);
//		printName(manager);
//		manager.approveLeaves();
//		System.out.println(manager);
		

	}
	
	public static void  printName(Employee emp){
		System.out.println("Name is "+ emp.name);
		System.out.println(emp.salary);


		
	}
	
	/*public static void  printMangerName(Manager manager){
		System.out.println("Manager Name is "+ manager.name);
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	

}