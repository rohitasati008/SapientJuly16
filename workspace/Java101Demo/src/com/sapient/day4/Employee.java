package com.sapient.day4;

public class Employee implements Comparable {
	
	Integer id;
	String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.id.compareTo(e.id);
		
		/*if(this.id>e.id){
			return 1;
		}
		else if(this.id == e.id){
			return 0;
		}
		return -1;*/
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
