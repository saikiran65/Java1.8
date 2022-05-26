package com.mapReduce.javaTechie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class Student{
	private Integer id;
	private String name;
	private Double avg;
	private String school;
	public Student(Integer id, String name,Double avg, String school) {
		super();
		this.id = id;
		this.name = name;
		this.avg = avg;
		this.school = school;
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
	
	public Double getAvg() {
		return avg;
	}
	public void setAvg(Double avg) {
		this.avg = avg;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", avg=" + avg + ", school=" + school + "]";
	}
	
	
}

public class MapReduceEg {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student(101,"Ashok",81.4,"ABS"), 
				new Student(108,"JAI",78.6,"MGS"),
				new Student(204,"mahesh",89.2,"ABS"),
				new Student(106,"naresh",68.3,"MGS"),
				new Student(202,"Jagan",76.4,"HPS"),
				new Student(207,"shekar",77.8,"ABS")
				);
		
		//find the average of all students
		double average = list.stream().map(s->s.getAvg()).mapToDouble(Double::doubleValue).average().getAsDouble();
		
		//find ABS school Average
		String school = "ABS";
		double avgAbs = list.stream().filter(s->s.getSchool().equals(school))
			.map(s->s.getAvg()).mapToDouble(Double::doubleValue).average()
			.getAsDouble();
		
		//topper of ABS
		Student student = list.stream().filter(s->s.getSchool().equals("ABS"))
			.sorted(Comparator.comparingDouble(Student::getAvg).reversed()).findFirst().get();
		System.out.println(student);
		
//		list.stream().filter(s->s.getSchool().equalsIgnoreCase("abs"))
//			.sorted(Comparator.comparingDouble(Student::getAvg).reversed())
//			.peek(s->{System.out.println("top : "+s);}).forEach(System.out::println);
	
		//no of students of MGS
		long count = list.stream().filter(s->s.getSchool().equalsIgnoreCase("mgs"))
			.count();
		System.out.println(count);
		
		//practice
		list.stream().map(s -> s.getAvg()).mapToDouble(i->i).average();
		list.stream().map(s -> s.getAvg()).mapToDouble(Double::doubleValue).average();
		
		//>80%
		list.stream().map(s->s.getAvg()).filter(v -> (v>80)).count();
		
		//>80% records
		list.stream().filter(s -> s.getAvg()>80).forEach(System.out::println);
		
		//distinct schools
		list.stream().map(s->s.getSchool()).distinct().forEach(System.out::println);
		
		//topper
		list.stream().reduce((s1,s2)->s1.getAvg()>s2.getAvg()?s1:s2).get();
		
		//sort on avg
		list.stream().sorted((s1,s2)->s2.getAvg().compareTo(s1.getAvg())).forEach(System.out::println);
	}
	
	
}
