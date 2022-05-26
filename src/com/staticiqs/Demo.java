package com.staticiqs;

class Test {
	
	static String var = "static data member";
	
	static void message() {
		System.out.println("static method");
	}
	
	static{
		System.out.println("static block");
	}

	void msg() {
		System.out.println("msg method >> test class");
	}
}

public class Demo extends Test{
	
	@Override
	void msg() {
		System.out.println("msg method >> demo class");
	}
	
	public static void main(String[] args) {
		System.out.println(Test.var);
		Test.message();
		
		Demo demo = new Demo();
		demo.msg();
		
		//to run static block its object must be created
		Test t = new Test();
	}
}

