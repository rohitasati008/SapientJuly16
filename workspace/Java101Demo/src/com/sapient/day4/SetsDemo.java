package com.sapient.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

		Set<String> phoneNumbers = new HashSet<>();		
		phoneNumbers.add("2");
		phoneNumbers.add("4");
		phoneNumbers.add("3");
		System.out.println(phoneNumbers);
		
		System.out.println(phoneNumbers.contains("4"));
		
		Set<String> phoneNumbers1 = new LinkedHashSet<>();	
		phoneNumbers1.add("2");
		phoneNumbers1.add("4");
		phoneNumbers1.add("3");
		System.out.println(phoneNumbers1);
		
		Set<String> phoneNumbers2 = new TreeSet<>();	
		phoneNumbers2.add("2");
		phoneNumbers2.add("4");
		phoneNumbers2.add("3");
		System.out.println(phoneNumbers2);
	}

}