package in.ashokit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesRemoval {

	public static void main(String[] args) {
		
		List<Object> list = Arrays.asList("abc","abc",21,22,21,'C','C','P');
				
//		List<?> lst = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(lst);
		
		Object[] ls = {"ab",101,'C',"z","ab",'C'};
		
		Set<Object> set = new HashSet<>();
		
		for(int i=0; i< list.size(); i++) {
			set.add(list.get(i));
		}
		
		
		System.out.println(set);
		
		/*
		 * Object[] l = new Object[ls.length];
		 * 
		 * Object[] r = new Object[ls.length];
		 * 
		 * for(int i=0; i<ls.length; i++) { l[i] = ls[i]; }
		 * 
		 * for(int i=0; i < ls.length; i++) { for(int j=i+1; j<ls.length; j++) {
		 * if(l[j].equals(ls[i])) { r[i]=ls[i]; } } }
		 * 
		 * for(int i=0; i<ls.length; i++) { if(r[i]!=null) { System.out.println(r[i]);
		 * for(int j=0; j<ls.length; j++) {
		 * 
		 * } } }
		 */
	
	}
}
