package com.collections.mapFlatMap.javaTechie;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private Integer id;
	private String name;
	private List<Long> mobileNumbers;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Long> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(List<Long> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public Employee(Integer id, String name, List<Long> mobileNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumbers = mobileNumbers;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + "]";
	}
}

public class MapMethodEg {
	
	public static void main(String[] args) {
		
//		------------ List ---------------------------
		
		List<Long> pList = Arrays.asList(998989L,8989898L);
		
		List<Employee> eList = Arrays.asList(new Employee(101,"Ramesh",pList),new Employee(102,"Suresh",pList));
		
//		eList.stream().map(e -> e.getName()).forEach(System.out::println);
//		List<Long> flatList = eList.stream().flatMap(e -> e.getMobileNumbers().stream()).collect(Collectors.toList());
//		System.out.println(flatList);
		
		
//		-------------- Map -------------------------
		
		Map<Employee,String> map = new HashMap<>();
		map.put(new Employee(101,"Ramesh",pList), "First");
		map.put(new Employee(102,"Suresh",pList), "Second");
		
		//map() method for 1 to 1 relationship
		map.entrySet().stream().map(e -> e.getKey().getMobileNumbers()).forEach(System.out::println);
		
		//flatMap() for 1 to n relationship >> e.getKey().getMobileNumbers() is again a stream
		map.entrySet().stream().flatMap(e -> e.getKey().getMobileNumbers().stream()).forEach(System.out::println);
	
		map.entrySet().stream().flatMap(es -> es.getKey().getMobileNumbers().stream()).collect(Collectors.toList());
	
		//practice
		map.entrySet().stream().flatMap(e -> e.getKey().getMobileNumbers().stream()).forEach(System.out::println);
	}

}
