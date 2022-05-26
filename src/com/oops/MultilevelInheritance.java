package com.oops;

public class MultilevelInheritance implements Fruit, Bread {

	@Override
	public void taste() {
		System.out.println("Taste is sweet, salty");
	}

	@Override
	public void color() {
		Bread.super.color();
		Fruit.super.color();
	}
	
	
}
