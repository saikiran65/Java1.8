package com.geeksforgeeks.singleton;

public class SingletonPractice {
	
	private static SingletonPractice singleton = null;
	
	public String str;
	
	private SingletonPractice() {
		
	}
	
	public static SingletonPractice getInstance() {
		if(singleton == null) {
			singleton = new SingletonPractice();
		}
		
		return singleton;
	}

}
