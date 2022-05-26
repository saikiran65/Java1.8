package com.innnerclass.egs;

public class StaticClass {
	
	public static void main(String[] args) {
		Outer3.Inner inner = new Outer3.Inner();
		System.out.println(inner.inr);
	}

}

class Outer3{
	
	static class Inner{
		String inr = "static inner";
	}
}
