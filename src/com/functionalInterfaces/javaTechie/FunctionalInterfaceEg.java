package com.functionalInterfaces.javaTechie;

interface Book{
	
	void chapter(); //public abstract by default
	
	default void msg() {
		System.out.println("Publisher is AsianTexts");
	}
	
	static void author() {
		System.out.println("Author : NagoorKani");
	}
}

//Functional Interface is an interface with min one abstract method and can have any no. of default and static methods
public class FunctionalInterfaceEg {
	
	public static void main(String[] args) {
		
		Book book = new Book(){//-------------anonymous class starts --------
			public void chapter() {
				System.out.println("Consitst 10 Chapters");
			}
		};//----------anonymous class ends -------------
		
		book.chapter();
		book.msg();
		Book.author();
		
		System.out.println("*********************************************");
		
		//using lambda expressions ( we should use anonymous method)
		//lambda expression >> used to provide the implementation of abstract methods using anonymous methods**
		//lambda uses arguments() -> body
		Book book1 = () -> System.out.println("consists 10 chapters");
		
		book1.chapter();
		book1.msg();
		Book.author();
		
	}

}
