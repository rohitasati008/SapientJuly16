package com.sapient.day3;

public class TestAbstractDemo {

	public static void main(String[] args) {
		
		int x = 128;
		
		
//		x = y;
		byte y = (byte)x;
		System.out.println(y);
		/*
		RoadBicycle r1 = new RoadBicycle(40);
		RoadBicycle r2 = new RoadBicycle(50);
		
		MountainBiCycle m1 = new MountainBiCycle(40);
		MountainBiCycle m2 = new MountainBiCycle(50);
		
			IBicycle bicycles[] = {r1,r2,m1,m2};
			
			for(IBicycle b : bicycles){
				
				b.speedUp(2);
				b.changeGear();
				Bicycle bb = (Bicycle)b;
				if(b instanceof MountainBiCycle){
					MountainBiCycle mb = (MountainBiCycle)b;
					System.out.println(mb.abc);
				}
				
				System.out.println(bb.speed);
			}*/

	}

}
