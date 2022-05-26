package com.collections.javaTechie;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEg {
	
	public static void main(String[] args) {
		
		//HashTable not allows null keys, null values >> because keys implements equals() and hashcode() method and when null is encountered null cannot be used for equals() , hashcode() method and throws NullPointerException
		
		//HashTable<>() implements Map<K,V>
//		Map<String, Integer> map = new Hashtable<>();
		
		//HashMap will allow null keys, null values
		Map<String, Integer> map = new HashMap<>();
		
		map.put("INDIA", 101);
		map.put("USA", 102);
		map.put(null, 103);
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
//			map.put("CANADA",103);
		}
		
		System.out.println("**********************************");
		//HashTable is synchronized, all methods of HashTable are synchronized - thread safe
		//HashTable will not allow null keys, null values
		Hashtable<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("Jackson", 101);
		
		hashTable.keySet().stream().forEach(System.out::println);
		hashTable.values().stream().forEach(System.out::println);
		
	}

}
