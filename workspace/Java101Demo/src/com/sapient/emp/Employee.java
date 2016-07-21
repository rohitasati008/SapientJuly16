package com.sapient.emp;
import java.lang.String;
import java.lang.*;

public class Employee {
	
	public Employee(){
		
	}
	
	public Employee(int id2, String name, int age){
		id = id2;
		this.name = name;
		this.age = age;
	}
	
	public int id;
	public String name;
	public String lastname;
	public int age;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname="
				+ lastname + ", age=" + age + "]";
	}

	public boolean isAdult(){
		if(this.age> 18){
			return true;
		}
		return false;
	}
	

}
