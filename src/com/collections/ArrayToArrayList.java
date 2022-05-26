package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		int[] num = new int[10];
		num[0]=8989;
		
		//array to list using Arrays.asList()
		List<Integer> list = Arrays.asList(num[0],num[9]);
		
		//list to array using toArray()
		Object[] array = list.toArray();
		
		System.out.println(array[0]);
		
		List<Integer> list2 = Collections.synchronizedList(list);
		
		System.out.println(list2);
		
	}

}
