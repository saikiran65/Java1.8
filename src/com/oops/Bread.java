package com.oops;

public interface Bread {

	//abstract method > public abstract by nature
	void taste();
	
	//default method
	default void color() {
		System.out.println("rectangle");
	}
}
