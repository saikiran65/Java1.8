package com.collections.javaTechie;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object e) {
		if(this.contains(e)) {
			return true;
		}else {
			return super.add(e);
		}
	}
	
	public static void main(String[] args) {
		
		
		List list = new CustomArrayList();
		
		list.add("Vijay");
		list.add("kumar");
		list.add("kate");
		list.add("kate");
		
		System.out.println(list);
	}
}
