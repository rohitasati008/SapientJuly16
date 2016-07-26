package com.sapient.day5;

public class Address {
	
	int houseNumber;
	String locality;
	public Address(int houseNumber, String locality) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality
				+ "]";
	}

}
