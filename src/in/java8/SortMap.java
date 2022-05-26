package in.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortMap {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Kate", 101);
		map.put("Jason", 122);
		map.put("Sandy", 901);
		map.put("Peter", 809);
		
		//practice
//		map.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e2.getValue())).forEach(System.out::println);
		map.entrySet().stream().sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
								.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a,b)-> a,LinkedHashMap::new)
										);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(v->v)))
		.forEach(System.out::println);
		
		
		//iterate a map >> basics
		/*
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		//sort a map based on key
		//conventional
//		map.forEach((a,b) -> System.out.println(a+b));
		
//		map.entrySet().stream().forEach(e -> System.out.println(e.getKey()));
		
		//to get only keys
//		List<String> onlyKeys = map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
		
		//print keys or values
//		map.forEach((k,v) -> System.out.println(k+">>"+v));
		
		//sorting now
//		map.entrySet().stream().sorted((e1,e2)-> e1.getKey().compareTo(e2.getKey())).forEach(System.out::println);
		
		
		//sorting and getting collection back
		/*LinkedHashMap<String, Integer> lhm = map.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
				.collect(
							Collectors.toMap(Map.Entry::getKey, 
								 Map.Entry::getValue,
								 (e1,e2)-> e1, LinkedHashMap::new)
				);
		lhm.forEach((k,v) -> System.out.println(k+">>"+v));
		*/
		
		
		//practice------------------------------------------------
//		map.entrySet().forEach(System.out::println); //k=v
		
//		map.entrySet().forEach(es -> System.out.println(es.getKey()));
//		map.entrySet().forEach(es -> System.out.println(es.getValue()));
		
//		map.keySet().forEach(System.out::println);
		
//		map.values().stream().sorted((e1,e2) -> e1.compareTo(e2)).forEach(System.out::println);
		
		/*
		LinkedHashMap<String, Integer> lhm1 = map.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
			.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (a,b)-> a,LinkedHashMap::new)
					);
		System.out.println(lhm1);
		*/
		
		
	}

}
