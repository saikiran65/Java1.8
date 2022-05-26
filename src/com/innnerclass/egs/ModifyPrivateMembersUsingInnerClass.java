package com.innnerclass.egs;

public class ModifyPrivateMembersUsingInnerClass {
	
	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		Outer2.Inner inner = outer.new Inner();
		inner.getPrivateMember("value");
		
		String var = outer.getVar();
		System.out.println(var);
	}
}

class Outer2{
	
	private String outerMem = "outer member";
	
	public String getVar() {
		return this.outerMem;
	}
	
	public class Inner{
		
		void getPrivateMember(String modify) {
			 outerMem = modify;
		}
	}
}