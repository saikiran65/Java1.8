package com.mapReduce.javaTechie;

import java.util.Arrays;
import java.util.List;

public class MapReduceBasics {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,8,4,87,3);
		
		//using mapTo methods >> average(),min(),max() are reduce methods
		double average = list.stream().mapToDouble(i->i).average().getAsDouble();
		int sum = list.stream().mapToInt(i->i).sum();
		int min = list.stream().mapToInt(i->i).min().getAsInt();
		int max = list.stream().mapToInt(i->i).max().getAsInt();
		list.stream().mapToInt(Integer::intValue).max().getAsInt();
		
		//using reduce
		//T reduce(Integer identity, BinaryOperator<T> accumulator);
		Integer sumVal = list.stream().reduce(0,(a,b)->a+b);
		Integer multiply = list.stream().reduce(1,(a,b)->a*b);
		
		Integer maxVal = list.stream().reduce((a,b)->a>b?a:b).get();
		Integer maxByMethodReference = list.stream().reduce(Integer::max).get();
		
		
		//practice
//		Integer sumValue = list.stream().reduce(0,(a,b)->a+b);
		list.stream().mapToDouble(i->i).average().getAsDouble();
		list.stream().count();
		long count = list.stream().filter(v -> (v>9)).count();
		System.out.println(count);
		
		list.stream().reduce((a,b)-> (a>b)?a:b).get();
		list.stream().mapToDouble(i->i).average().getAsDouble();
		
	}
}
