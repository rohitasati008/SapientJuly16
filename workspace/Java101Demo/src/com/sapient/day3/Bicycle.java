package com.sapient.day3;

public abstract class Bicycle implements IBicycle {
	
	public Bicycle(int speed) {
		this.speed = speed;
	
	}
	
	public void changeGear(){
		System.out.println(ELIGIBILITY_AGE);
		System.out.println("Change gear is common to all");
	}
	int speed;

}
