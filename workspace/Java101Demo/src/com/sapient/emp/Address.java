package com.sapient.emp;

public class Address {
	
	/*Address(int houseNumber, String locality, String city, int pinCode){
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
		this.pinCode = pinCode;
	}*/
	int houseNumber;
	String locality;
	String city;
	int pinCode;
	
	public Address(){
		
	}
	
	public void trimPinCode(){
		int i;
		System.out.println(i);
		
		String str = "" + this.pinCode;
		String trimmedValue = str.substring(4);
		System.out.println("Trimmed Pin Code is " + trimmedValue);
	}

	public Address(int houseNumber, String locality, String city, int pinCode) {
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality
				+ ", city=" + city + ", pinCode=" + pinCode + "]";
	}

	/*public void printWholeAddress() {
		System.out.println("House No: " + this.houseNumber + "locality: "+ this.locality + "city: "+ this.city + "Pin Code : "+ this.pinCode);
	}
*/
}
