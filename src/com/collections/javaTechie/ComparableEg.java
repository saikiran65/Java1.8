package com.collections.javaTechie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// why we need comparable or comparator
// to sort custom objects based on certain criteria (on id, on name, on any parameter/variable of class)
// should use Collections.sort() to achieve the sorted list
// not applicable for Set (applicable for List, Map)
// Comparable will change the signature/behavior of the class by implementing Comparable<T> interface also override compareTo(p1) method
public class ComparableEg {

	public static void main(String[] args) {
		
		Student st1 = new Student(402,"Mike");
		Student st2 = new Student(401,"Kate");
		
		List<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	
}
class Student implements Comparable<Student>{
	
	private Integer id;
	private String name;
	
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
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
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student s) {
		
		if(this.getId()==s.getId()) {
			
			return 0;
			
			//use name comparison if ids are equal here compareTo(String) is the predefined method
			//return this.getName().compareTo(s.getName());
		
		}else if(this.getId()>s.getId()) {
			return 1;
		}else {
			return -1;
		}
	}
}
