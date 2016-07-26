package com.sapient.day5;
import static java.lang.Math.random;

public class Features15 {

	public static void main(String... args) {
		System.out.println(add(2,3,4));
		System.out.println(add(2,3,4,4,6,6,7));
		
		System.out.println(random());
		
		

	}
	
	static int add(int x, int... num){
		int result = 0;
		for(int i: num){
			result+=i;
		}
		return result;
	}
	
	/*int add(int x, int y){
		return x + y;
	}
	int add(int x, int y, int z){
		return x + y + z;
	}
*/
}
