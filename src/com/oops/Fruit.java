package com.oops;

public interface Fruit {
	
	//abstract method > public abstract by nature
	void taste();
	
	//default
	default void color() {
		System.out.println("mostly circular");
	}
}
