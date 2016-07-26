package com.sapient.day3.collections;

public class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
        return (this.id == e.id);
    }

	public static void main(String args[]){
		Employee emp1 = new Employee(12, "Ravi");
		Employee emp2 = new Employee(12, "Amit");
		Employee emp3 = emp2;
		
		
		boolean result = emp1.equals(emp2);
		System.out.println(result);
	}

}