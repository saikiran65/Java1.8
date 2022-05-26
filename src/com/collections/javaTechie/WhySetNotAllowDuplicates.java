package com.collections.javaTechie;

import java.util.HashSet;
import java.util.Set;

public class WhySetNotAllowDuplicates {
	
	public static void main(String[] args) {
		
		//Set will not maintain the insertion order
		Set set = new HashSet();
		
		set.add(201);
		set.add(201);
		
		Integer i1 = new Integer(901);
		Integer i2 = new Integer(901);
		set.add(i1);
		set.add(i2);
		
		System.out.println(set);
		
		//* set internally uses map(k,v) where k follows hashcode(),equals() contract and v is a dummy object
		// for primitives, wrapper class objects by default internally hashcode(),equals() contract will be followed
		//for custom objects we need to override hashcode() and equals() method in the custom classes
		//inorder to maintain the uniqueness in storage of elements
	}

}
