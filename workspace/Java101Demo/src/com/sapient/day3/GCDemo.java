package com.sapient.day3;

public class GCDemo {

	public static void m1() {
		m1();
	}

	public static void main(String[] args) {
//		m1();
		
//		String ELIGIBILITY_AGE = "18";
		
		StringBuilder builder = new StringBuilder("");
//		String str = "";
		for (int i = 0; i < 10; i++) {
//			str = str + i;
			builder.append(i);
		}
		System.out.println(builder);
		
		
		String str2 = new String("Ravi");
		String str1 = "Ravi";
		
		String str3 = str1.concat(" Sharma");
		
		if(str1 == str2){
			System.out.println("Same");
		}
		else{
			System.out.println("Different");
		}
		
//		String str1 = new String("Ravi");
		
		/*String str = "";
		 str = str.concat("Ravi");
		
		
		
		for (int i = 0; i < 100000000; i++) {
			str = str + i;
		}

		System.out.println(str);*/

		/*
		 * RoadBicycle r1 = new RoadBicycle(40); RoadBicycle r2 = new
		 * RoadBicycle(40); RoadBicycle r3 = r2;
		 * 
		 * System.out.println(r1); System.out.println(r2);
		 * System.out.println(r3);
		 * 
		 * System.out.println(r1 == r2);
		 */

	}
}