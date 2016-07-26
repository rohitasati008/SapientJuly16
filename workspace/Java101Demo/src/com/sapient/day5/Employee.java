package com.sapient.day5;

import java.util.List;



public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private List<Address> addresses;
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", addresses=" + addresses + "]";
	}
	public Employee(int id, String name, double salary,List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addresses = addresses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}