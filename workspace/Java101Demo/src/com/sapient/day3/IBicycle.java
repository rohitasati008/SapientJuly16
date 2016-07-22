package com.sapient.day3;

public interface IBicycle {
	
	final static int ELIGIBILITY_AGE=18;
	
	public  void applyBrakes(int decrement);
	public  void speedUp(int increment);
	public void changeGear();
}
