package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(101);
		list.add(102);
		list.add(102);
		list.add(103);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("**");
		Iterator itr1 = list.iterator();
		Collections.reverse(list);
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("**");
		
		
		Iterator itr3 = list.iterator();
		Collections.reverse(list);
		
//		Set set = new LinkedHashSet();
		Set set = new HashSet();
		
		while(itr3.hasNext()) {
//			System.out.println(itr3.next());
			set.add(itr3.next());
		}
		Iterator sItr = set.iterator();
		while(sItr.hasNext()) {
			System.out.println(sItr.next());
		}
//		
//		
	}

}
