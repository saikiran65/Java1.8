package com.collections.javaTechie;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEg {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new ConcurrentHashMap<>();
//		Map<String, Integer> map = new HashMap<>();
		
		map.put("INDIA", 101);
		map.put("USA", 201);
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext()) { //one thread accessing the collection & is involved in the iteration
			map.put("CANADA",301); //another thread is trying to access the collection to modify the collection
			//>> will be interrupted by HashMap by giving ConcurrentModificationException due to modCount criteria
			System.out.println(itr.next());
		}
		
		System.out.println(map);
	}

}
