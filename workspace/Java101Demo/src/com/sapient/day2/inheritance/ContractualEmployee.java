package com.sapient.day2.inheritance;

public class ContractualEmployee extends Employee {

	double ratePerHour;

	
	@Override
	public void incrementSalary(){
		this.ratePerHour = this.ratePerHour + 5000;
	}
	
	public ContractualEmployee(int id, String name, double ratePerHour) {
		super(id, name);
		this.ratePerHour = ratePerHour;
	}

	@Override
	public String toString() {
		return "ContractualEmployee [ratePerHour=" + ratePerHour + ", id=" + id
				+ ", name=" + name + "]";
	}
}
