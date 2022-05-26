package com.collections.javaTechie;

import java.util.ArrayList;
import java.util.List;

public class FinalKeywordList {
	
	//we can use the modifiers for final variable
//	private final List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
	// cannot use private public modifiers for final variable inside the method
	final List<String> list = new ArrayList<>();
		
		list.add("HINDUSTAN");
		list.add("INDIA");
		
		//we cannot re assign the list
//		list = new ArrayList<>();
	}
	

}
