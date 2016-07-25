package com.sapient.day4.problem;

public class Branch {
	String location;
	boolean mainBranch;
	public Branch(String location, boolean mainBranch) {
		super();
		this.location = location;
		this.mainBranch = mainBranch;
	}
	@Override
	public String toString() {
		return "Branch [location=" + location + ", mainBranch=" + mainBranch
				+ "]";
	}

}
