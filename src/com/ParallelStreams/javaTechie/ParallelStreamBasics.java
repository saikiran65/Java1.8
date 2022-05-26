package com.ParallelStreams.javaTechie;

import java.util.stream.IntStream;

public class ParallelStreamBasics {
	
	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::println);
		end = System.currentTimeMillis();
		
		System.out.println("PlainStream time : "+(end-start));
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		
		System.out.println("ParallelStream time : "+(end-start));
	}

}
