package com.sapient.day2.inheritance;

class Person{	
}
class Employee11 extends Person{
}
class Manager extends Employee11{
}

public class TestMoreInheritance {

	public static void main(String[] args) {
		Person p = new Employee11();
		
		if(p instanceof Employee11){
			System.out.println("Yes instance/object of Employe11");
			Employee11 e = (Employee11)p;
		}
		
		
		Employee11 e1 = new Employee11();
		
		System.out.println("All Fine");
		
	}

}
