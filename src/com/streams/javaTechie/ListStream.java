package com.streams.javaTechie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {

	private Integer id;
	private String name;
	private Integer std;
	private Double avg;
	
	

	public Student() {
	}

	public Student(Integer id, String name, Integer std, Double avg) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.avg = avg;
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

	public Integer getStd() {
		return std;
	}

	public void setStd(Integer std) {
		this.std = std;
	}

	public Double getAvg() {
		return avg;
	}

	public void setAvg(Double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", avg=" + avg + "]";
	}

}

public class ListStream {

	public static List<Student> getStudentList() {

		Student s3 = new Student(117, "brooke", 2, 84.2);
		Student s1 = new Student(121, "steve", 5, 80.9);
		Student s2 = new Student(133, "elvin", 7, 71.3);
		Student s4 = new Student(101, "weise", 8, 67.7);

		List<Student> list = Arrays.asList(s1, s2, s3, s4);

		return list;
	}

	public static void main(String[] args) {
		
		//1. forEach(Consumer<T>), void accept(T); 
		//ListStream.getStudentList().stream().forEach(t -> System.out.println(t));
		
		//2. filter(Predicate<T>) , boolean Test(T);
//		ListStream.getStudentList().stream().filter(t -> t.getAvg()>80.0).forEach(t ->System.out.println(t));
		
		//find > 80%
//		List<Student> collectList = ListStream.getStudentList().stream().filter(t -> t.getAvg()>80.0)
//				.sorted((s1,s2)-> s2.getAvg().compareTo(s1.getAvg())).collect(Collectors.toList());
//		System.out.println(collectList);
		
		
		//> 90% and topper
//		Optional<Student> topper = Optional.of(ListStream.getStudentList().stream().filter(s -> s.getAvg()>90.0)
//				.sorted((s1,s2)->s2.getAvg().compareTo(s1.getAvg())).findFirst().orElse(new Student()));
//		
//		System.out.println(topper.get());
		
		
		
		//** important >> using Comparator.comparing()
//		ListStream.getStudentList().stream().sorted(Comparator.comparing(s -> s.getAvg())).forEach(System.out::println);
		
		//Using Comparator.comparing() methodReference
		ListStream.getStudentList().stream().sorted(Comparator.comparing(Student::getAvg).reversed()).forEach(System.out::println);
	
		
	
	}

}
