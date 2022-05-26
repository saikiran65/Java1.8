package com.geeksforgeeks.singleton;

public class Test {
	
	static SingletonPractice ss;

	public static void main(String[] args) {
			
		
		System.out.println(ss);
			
		SingletonPractice s = SingletonPractice.getInstance();
		s.str="singleton";
		
		SingletonPractice s1 = SingletonPractice.getInstance();
		s1.str="new singleton";
		
//		System.out.println(s.hashCode()+" : "+s1.hashCode());
		
//		System.out.println(s.equals(s1));  //true
		
		System.out.println(s.str+" : "+s1.str);
	
	}

}
