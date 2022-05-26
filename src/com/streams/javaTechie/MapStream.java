package com.streams.javaTechie;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStream {

	public static void main(String[] args) {

		List<Student> list = ListStream.getStudentList();

		Map<Student, String> map = new HashMap<>();

		list.stream().forEach(s -> {
			map.put(s, "ABC School");
		});

		System.out.println(map);

		// 1. sort map using student avg descending

		// in this approach reversed() method is not working
//		map.entrySet().stream()
//				.sorted(Map.Entry.comparingByKey(Comparator.comparing(s -> s.getAvg())))
//				.forEach(System.out::println);

		// *using method reference only reversed() is working
//		map.entrySet().stream()
//				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getAvg).reversed()))
//				.forEach(System.out::println);

		//2. sort map using student std descending and ascending
		
		map.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getStd)))
			.forEach(System.out::println);
		
	}
}
