package com.sapient.day3;

public class MountainBiCycle  extends Bicycle{

	
	int abc;
	

	public MountainBiCycle(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyBrakes(int decrement) {
		this.speed = this.speed - (decrement * 2);
		
	}

	@Override
	public void speedUp(int increment) {
		this.speed = this.speed + (increment * 2);
		System.out.println(this.speed);
		
	}

	

}
