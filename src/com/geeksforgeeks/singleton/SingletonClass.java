package com.geeksforgeeks.singleton;

import java.io.Serializable;

public class SingletonClass extends SingleTonBreaking implements Serializable{
	
//	to avoid the static instance of the class
	private static SingletonClass singleton_instance;
	
//	private constructor to avoid the instance creation
	private SingletonClass() {
		// to deal singleton breaking with reflection
		if(singleton_instance!=null) {
			throw new IllegalStateException("Object cannot be created using reflection");
		}
	}
//	public method to return singleton class instance
	public static synchronized SingletonClass getInstance() {
		if(singleton_instance == null) {
			singleton_instance = new SingletonClass();
		}
		return singleton_instance;
	}
	//to control the singleton breaking using object clone
	@Override
	protected Object clone() throws CloneNotSupportedException {
	  throw new CloneNotSupportedException("clone not supported"); 
	}
	
	//to control the singleton breaking using deserialization
	//this method will invoke during deserialization
	protected Object readResolve() {
		return singleton_instance;
	}
}
