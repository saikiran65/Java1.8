package com.streams.javaTechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStreamBasics {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put("Two", 2);
		map.put("Four", 4);
		map.put("Eight", 8);
		map.put("Ten", 10);
		
		System.out.println(map);
		
		//1.conventional way ---------------------------------
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		List<Entry<String,Integer>> list = new ArrayList<>(entrySet);
		
		
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		
		System.out.println(list);
		
		//--------------------------------------------------------------
		
		List<Entry<String, Integer>> list1 = new ArrayList<>(map.entrySet());
		
		//2. using lambda expression ---------------------------------
		
		Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));
		
		System.out.println(list);
		
		//--------------------------------------------------------------
		
		//3. using Comparator.comparing() ----- POSSIBLE ONLY FOR STREAMS -----------
		
		list1.stream().sorted(Comparator.comparing(e->e.getValue())).forEach(System.out::println);
		list1.stream().sorted(Comparator.comparing(e ->e.getKey())).forEach(System.out::println);
		
		//4. using maps direct -------------------
		System.out.println("**************using maps direct*************");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
