package com.ParallelStreams.javaTechie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Employee{
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class EmployeeDB {
	
	public static List<Employee> getEmployees(){
		
		List<Employee> elist = new ArrayList<>();
		
		for(int i=0; i < 1000; i++) {
			elist.add(new Employee(i,"employee_"+i, Double.valueOf(new Random().nextInt(1000*100))));
		}
		
		return elist;
	}

}
