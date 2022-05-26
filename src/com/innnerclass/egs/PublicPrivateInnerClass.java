package com.innnerclass.egs;

public class PublicPrivateInnerClass {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.msg();
		
		Outer.Inner1 inner1 = outer.new Inner1();
		
		System.out.println(inner1.inner1);
	}
}

class Outer{
	
	String outerMem = "outer member";
	
	//1.private inner class >> cannot be accessed using outer class instance
	private class Inner{
		String inrMem = "inner";
	}
	
		//way of accessing private inner class members using outer class methods
		void msg() {
			Inner inr = new Inner();
			System.out.println(inr.inrMem);
		}
	
	//2.public inner class >> can be accessed using instance of outer class instance
	public class Inner1{
		String inner1 = "inner1";
	}
}
