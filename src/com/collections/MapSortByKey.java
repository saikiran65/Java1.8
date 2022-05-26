package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapSortByKey {
	
	public static Map<String,Integer> map = new HashMap<>();
	
	//1. Using TreeMap
	public static void sortMap() {
		
		TreeMap<String,Integer> tMap = new TreeMap<>(map);
		
		tMap.entrySet().stream().forEach(System.out::println);
	}
	
	//2. Using ArrayList
	public static void sortByArrayList() {
		ArrayList<String> alist= new ArrayList<>(map.keySet());
		Collections.sort(alist);
		
		alist.stream().forEach(e -> System.out.println(e +" : "+map.get(e)));
	}
	
	//3. Using streams
	public static void sortUsingStreams() {
		LinkedHashMap<String, Integer> hMap = map.entrySet().stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue()))
		.collect(Collectors.toMap(
					Map.Entry::getKey, 
					Map.Entry::getValue,
					(e1,e2)->e1,
					LinkedHashMap::new)
				);
		hMap.entrySet().stream().forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		map.put("Abhishek", 90);
		map.put("Amit", 75);
		map.put("Anushka", 80);
		map.put("Danish", 40);
		map.put("Jayant", 80);
		
//		sortMap();
//		sortByArrayList();
		sortUsingStreams();
	}

}
