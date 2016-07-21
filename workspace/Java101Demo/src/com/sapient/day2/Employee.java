package com.sapient.day2;

public class Employee extends Object{
	int id;
	String name;
	double salary;
	public Employee(){
		
	}
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void incrementSalary(double percentage){
		System.out.println("Employee class");
		this.salary = this.salary * percentage;
	}

	/*@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}*/

	

}
