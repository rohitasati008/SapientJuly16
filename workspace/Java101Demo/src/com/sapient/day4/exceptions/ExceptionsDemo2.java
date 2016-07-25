package com.sapient.day4.exceptions;

public class ExceptionsDemo2 {
	
	public static void m1(String bookName){
		
		
			
			if(bookName==null){
				throw new BookException("Book not found");
			}
			
			System.out.println("Book name is " + bookName);
		
		
		
	}

	public static void main(String[] args) {
		
		m1(args[0]);
		
		System.out.println("All well");

	}

}
