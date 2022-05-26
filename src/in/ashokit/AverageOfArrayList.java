package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AverageOfArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(221,234,223);
		
		double dbl = list.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println(dbl);
		
		list.stream().reduce(0,(a,b)->a+b);
		list.stream().reduce(1,(a,b)->a*b);
		list.stream().reduce(Integer::max);
		list.stream().reduce(Integer::min);
		
		
		Integer i = list.stream().reduce((a,b)-> a>b?a:b).get();
		list.stream().anyMatch(v -> v>300);
		
		System.out.println(i);
	}

}
