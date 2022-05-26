package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SortArrayList {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(102);
		list.add(89);
		list.add(100);
		list.add(1111);
		
		//1. Approach >> sort array in ascending order (default)
		
		Collections.sort(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**********************************");
		
		//1. Approach >> sort array in descending order
		Collections.sort(list);
		Collections.reverse(list);
		
		list.stream().forEach(item -> System.out.println(item));
		
		System.out.println("**********************************");
		
		//2. Approach >> sort array in descending order
		Comparator<Object> cmp = Collections.reverseOrder();
		Collections.sort(list, cmp);
		
		list.stream().forEach(System.out::println);
		
	}

}
