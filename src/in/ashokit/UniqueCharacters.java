package in.ashokit;

import java.util.Arrays;
import java.util.List;

public class UniqueCharacters {
	
	public static void main(String[] args) {
		
	String str ="bacc";
	String s = "baac";
	
	//string comparison -----------------------
//	System.out.println(str.equals(s));
	
	//non repetitive characters using indexOf() print only unique characters ( O(n) time complexity)--------------------------------
	/*
	for(int i=0; i<str.length(); i++) {
		int index = str.indexOf(str.charAt(i),i+1);
		if(index==-1) {
			System.out.print(str.charAt(i));
		}
	}
	*/
	
	//anagrams
		str = str.replaceAll("\\s", ""); //"\\s" is white space
		s = s.replaceAll("\\s", "");
		
		char[] c1 = str.toCharArray();
		char[] c2 = s.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean equals = Arrays.equals(c1, c2);
		if(equals) {
			System.out.print("Anagram");
		}
		else {
			System.out.print("Not Anagram");
		}
	
	//non repetitive characters-----------------
	/*
	for(int i=0; i<str.length(); i++) {
		if(!s.contains(str.charAt(i)+"")){
			System.out.println(str.charAt(i));
		}
	}
	for(int i=0; i<s.length(); i++) {
		if(!str.contains(s.charAt(i)+"")) {
			System.out.println(s.charAt(i));
		}
	}
	*/
	
	//duplicate characters from the string --------------------
	/*
	 for(int i=0; i<str.length(); i++) {
		for(int j=i+1; j < str.length(); j++) {
			
			if( str.charAt(j)==str.charAt(i)) {
				System.out.print(str.charAt(i));
			}
		}
	}
	*/
	
	//sort the string---------------------------------------
	/*
	char[] c = str.toCharArray();
	
	for(int i=0; i < c.length; i++) {
		for(int j=i+1; j< c.length; j++) {
			if(c[i]>c[j]) {
				char k = c[j];
				c[j]=c[i];
				c[i]=k;
			}
		}
	}
	
	for(char ch : c) {
		System.out.print(ch);
	}
	*/
	
	// equal random strings  abc bca--------------------------
	/*
	int count=0;
		for(int i=0; i < str.length(); i++) {
		
		if(s.contains(str.charAt(i)+"") && str.contains(s.charAt(i)+"")) {
			count++;
		}
	}
	
	if(count==str.length()) {
		System.out.println("anagram");
	}else {
		System.out.println("Not anagram");
	}
	*/
	

  }
}
