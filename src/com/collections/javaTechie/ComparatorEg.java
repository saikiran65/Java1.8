package com.collections.javaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator Interface from java.util
//Comparator consists compare(p1,p2) method
//Comparator makes the sorting loosely coupled >> not changing the Custom Class signature
//It maintains a separate class extends Comparator<T> overriding compare(p1,p2) method which holds the logic of comparison based on which the sorting happens
//Collections.sort(List<T>,Comparator<T>); should be used to get the sorted results
public class ComparatorEg{
	public static void main(String[] args) {
		
		Student1 st1 = new Student1(111,"Larry");
		Student1 st2 = new Student1(111,"Holmes");
		Student1 st3 = new Student1(98,"Harry");
		
		List<Student1> list = Arrays.asList(st1,st2,st3);
		
		//Collections.sort(List<T>,Comparator<T>); should be used to get the sorted results
		Collections.sort(list, new ComparatorDemo());
		
		System.out.println(list);
		
	}
}

class Student1{
	
	private Integer id;
	private String name;
	
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
	public Student1(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
}

class ComparatorDemo implements Comparator<Student1>{

	@Override
	public int compare(Student1 s1, Student1 s2) {
		
		// TODO Auto-generated method stub
		
		//1. to sort based on ids
		//return s1.getId().compareTo(s2.getId());
		
		//2. to sort based on ids >> cond. if ids are equal then sort on names
		int idCmp = s1.getId().compareTo(s2.getId());
		if(idCmp==0) {
			return s1.getName().compareTo(s2.getName());
		}
		return idCmp;
	}
	
}
