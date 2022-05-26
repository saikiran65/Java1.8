package com.collections.javaTechie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEg {
	
	public static void main(String[] args) {
		
		List<String> list = new CopyOnWriteArrayList<>();
//		List<String> list = new ArrayList<>();
		
		list.add("abc");
		list.add("cde");
		list.add("efg");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//during the iteration() one thread is accessing the collection involving in printing the elements
			//list.add("ghi") is another thread trying to add element in the same collection
			//which is not accepted in case of ArrayList,HashMap etc.. (modcount changes... and gives ConcurrentModificationException
			//whenever other thread trying to modify the collection while one thread is using the same collection for some other operation
			
			list.add("ghi");
			
			//CopyOnWriteArrayList will solve the problem by using clone object whenever two threads try to access same collection
			//the changes will reflect to cloned collection and are not visible during the current iteration
			//after the iteration the reference will change to the cloned Collection
		}
		
		//after iteration we can observe the changes but the 'list' reference is pointing to the cloned object of the original 'list' collection object
		System.out.println(list);
	}

}
