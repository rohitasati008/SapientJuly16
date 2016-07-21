package com.sapient.day2.inheritance;

public class RegularEmployee extends Employee{
	
	double salary;
	int leavesAllowed;
	
	@Override
	public void incrementSalary(){
		this.salary = this.salary * 1.1;
	}
	
	public RegularEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public RegularEmployee(int id, String name, double salary, int leavesAllowed) {
		/*super(id, name);
		this.salary = salary;*/
		this(id, name, salary);
		this.leavesAllowed = leavesAllowed;
	}

	@Override
	public String toString() {
		return "RegularEmployee [salary=" + salary + ", id=" + id + ", name="
				+ name + "]";
	}



	


	
	

}
