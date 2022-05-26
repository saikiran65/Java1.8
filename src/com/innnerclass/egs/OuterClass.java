package com.innnerclass.egs;

class OuterCls {
	
	String outerMember = "outer Member";

	public class InnerClass{
		
		String innerMember = "inner Member";
		
		void msg() {
			System.out.println(outerMember);
		}
	}
}

public class OuterClass {
	
	public static void main(String[] args) {
		
		OuterCls oCls = new OuterCls();
//		System.out.println(oCls.outerMember);
		
		OuterCls.InnerClass inrCls = oCls.new InnerClass();
		
		System.out.println(inrCls.innerMember);
		inrCls.msg();
		
		//Not possible
//		System.out.println(inrCls.outerMember());
		
		
	}
}
