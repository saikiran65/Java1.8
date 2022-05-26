package com.ParallelStreams.javaTechie;

public class ParallelStreamEg {
	
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		double plainStreamAvg = EmployeeDB.getEmployees().stream()
			.map(emp -> emp.getSalary()).mapToDouble(i->i)
			.average().getAsDouble();
		long end = System.currentTimeMillis();
		
		System.out.println("Plain Stream : "+ (end-start));
		
		
		//------------------ Parallel Streams--------------------
		
		start = System.currentTimeMillis();
		double parallelStreamAvg = EmployeeDB.getEmployees().parallelStream().map(emp -> emp.getSalary())
			.mapToDouble(Double::doubleValue).average().getAsDouble();
		end = System.currentTimeMillis();
		
		System.out.println("Parallel Stream : "+ (end-start));
		
		System.out.println(parallelStreamAvg);
	}

}
