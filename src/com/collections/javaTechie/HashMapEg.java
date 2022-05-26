package com.collections.javaTechie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapEg {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		//hash map takes only one null key
		map.put(null, 101);
		map.put(null, null);
		map.put("hashmap test", null);
		map.put("hashmap test1", null);
		
		map.entrySet().forEach(System.out::println); 
		
		//Tree map
		//tree map doesnt take null keys not even once
		Map<String,Integer> treeMap = new TreeMap<>();
		
//		treeMap.put(null, null);
		treeMap.put("tree map Test", null);
		treeMap.entrySet().forEach(System.out::println);
		
		//hash set
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		set.add("set test");
		
		set.forEach(System.out::println);
		
		//tree set
		Set<String> treeset = new TreeSet<>();
		
//		treeset.add(null);
		treeset.add("tree set");
		treeset.forEach(System.out::println);
		
		
		//ArrayList and LinkedList maintains the insertion order
		//Linked list >> insertion order check
		List<Integer> llist =  new LinkedList<>();
		llist.add(101);
		llist.add(889);
		llist.add(89);
		llist.add(897);
		
		ListIterator<Integer> llistitr = llist.listIterator();
		while(llistitr.hasNext()) {
			System.out.println(llistitr.next());
		}
		
		
		
		
		
	}
}
