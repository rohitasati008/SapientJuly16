package com.sapient.day3.collections;

import java.util.LinkedList;
import java.util.List;

class Fruit{
	String name;
	
	Fruit(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Fruit f = (Fruit) obj;
		return this.name.equals(f.name);
		
	}
	
	
}

public class ListDemo {
	
	

	public static void main(String[] args) {
	
	    List fruits = new LinkedList();
		/*fruits.add(new String("Apple"));
		fruits.add(new String("Orange"));
		fruits.add(new String("Grapes"));*/
		fruits.add(new Fruit("Apple"));
		fruits.add(new Fruit("Orange"));
		fruits.add(new Fruit("Grapes"));
		
		System.out.println(fruits.contains(new Fruit("Apple")));
		
		printList(fruits);
		

	}
	
	private static void printList(List list){
		System.out.println(list);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
