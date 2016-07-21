package com.sapient.day2;

public class Employee {
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
		this.salary = this.salary * percentage;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	

}
