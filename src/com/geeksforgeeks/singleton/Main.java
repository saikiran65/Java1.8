package com.geeksforgeeks.singleton;

public class Main {
	
	public static void main(String[] args) {
		
		SingletonClass instance1 = SingletonClass.getInstance();
		
		SingletonClass instance2 = SingletonClass.getInstance();
		
		
		System.out.println("\n"+instance1.hashCode()+" : "+instance2.hashCode());
		
		if(instance1==instance2) {
			System.out.println("Equal");
		}else {
			System.out.println("NOT Equal"); 
		}
	}

}
