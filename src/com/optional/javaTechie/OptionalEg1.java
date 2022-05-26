package com.optional.javaTechie;

import java.util.Arrays;
import java.util.List;

public class OptionalEg1 {
	
	public static void main(String[] args) throws Exception {
		
		List<Student> list = Arrays.asList(
				new Student(101,"Ashok","ashok@gmail.com"), 
				new Student(108,"JAI","jai@gmail.com"),
				new Student(204,"mahesh","mahesh@gmail.com")
				);
		String test = "ashok@gmail.com";
		list.stream()
			.filter(st -> st.getEmail().equals(test))
			.findAny().orElseThrow(()-> new Exception("no record is present with the test mail"));
		
//		list.stream().filter(s -> s.getId().equals(109)).findAny().orElseThrow(()->new Exception("No Data"));
		
		Student std = list.stream().filter(s -> s.getName().equalsIgnoreCase("ashok"))
			.findAny().orElseThrow(() -> new Exception("No Data"));
		System.out.println(std);
	}

}
