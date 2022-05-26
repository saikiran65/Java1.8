package com.oops;

public class MultiInheritanceTest1 implements Fruit {
	
	@Override
	public void taste() {
		System.out.println("Mostly sweet");
	}

	public static void main(String[] args) {
		
		MultiInheritanceTest1 mi = new MultiInheritanceTest1();
		
		mi.color();
		mi.taste();
	}

}
