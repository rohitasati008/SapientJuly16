package com.sapient.day4.problem;

import java.util.List;

public class Bank {
	String name;
	List<Branch> branches;
	List<Atm> atms;
	public Bank(String name, List<Branch> branches, List<Atm> atms) {
		super();
		this.name = name;
		this.branches = branches;
		this.atms = atms;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", branches=" + branches + ", atms="
				+ atms + "]";
	}

}
