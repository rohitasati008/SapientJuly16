package com.sapient.day2;

public class Manager extends Employee{
	
	int numberOfEmployeesUnder;
	
	/*@Override
	public String toString() {
		return "Manager [numberOfEmployeesUnder=" + numberOfEmployeesUnder
				+ ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}*/

	public Manager(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public void incrementSalary(double percentage){
		System.out.println("Manager class");
		this.salary = this.salary * (percentage - .2);
	}
	
	public void approveLeaves(){
		System.out.println("Additional functinality -- approve leaves");
	}
	

}
