package com.collections.javaTechie;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		
		// for custom class need to implement comparable interface and write the logic on which parameter the sorting to be done
		Set<Employees> set = new TreeSet<>();
		
		Employees e1 = new Employees(111,"suman");
		Employees e2 = new Employees(111,"suman");
		Employees e3 = new Employees(109,"Jones");
		Employees e4 = new Employees(102,"Brad");
		
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println(set);
		
		//for Wrapper Classes, String class by nature comparable implementation is included, so sorting (ascending) can be done using TreeSet directly
		Set<String> set2 = new TreeSet<>();
		set2.add("Zate");
		set2.add("Peter");
		set2.add("Amanda");
		System.out.println(set2);
		
	}
}

// we have implemented comparable interface to tell the tree map to use id as parameter for its default sorting mechanism
class Employees implements Comparable<Employees> {
	
	private int id;
	private String name;
	
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employees e) {
		
		int res;
		
		if(this.id > e.getId()) {
			res = 1 ;
		}else if(this.id < e.getId()) {
			res = -1;
		}else {
			res = 0;
		}
		
		return res;
	}
	
}
