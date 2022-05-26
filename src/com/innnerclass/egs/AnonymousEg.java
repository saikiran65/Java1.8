package com.innnerclass.egs;

interface Book{
	void fn(); //by nature methods of interface are public abstract
}

public class AnonymousEg {
	
	public static void main(String[] args) {
		
		
		Book book = new Book() { //here there no object of class implementing Book Interface is created yet we define the behavior of class which is not having any identity
			public void fn() {
				System.out.println("Anonymous method");
			}
		};
		
		book.fn();
		
	}

}
