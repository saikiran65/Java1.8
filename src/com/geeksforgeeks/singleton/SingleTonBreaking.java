package com.geeksforgeeks.singleton;

public class SingleTonBreaking implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
