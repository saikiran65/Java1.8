package com.optional.javaTechie;

import java.util.Optional;

class Student{
	private Integer id;
	private String name;
	private String email;
	public Student(Integer id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
}

public class OptionalEg {
	
	public static void main(String[] args) throws Exception {
		Student st1 = new Student(101,"Ramesh","test");
		
		//we encouter NPE
//		if(st1.getEmail().equals("test@gmail.com")) {
//			System.out.println("test");
//		}else {
//			System.out.println("Db Data");
//		}
		
		//Manage Null Pointer Exception using Optional
		Optional<String> emailOptional = Optional.ofNullable(st1.getEmail());
		
		if(emailOptional.isPresent()) {
			if(emailOptional.get().equals("test@gmail.com")) {
				System.out.println("test");
			}else {
				System.out.println("Db Data");
			}
		}else {
			//custom exception logic
		}
		
	}
	
}
