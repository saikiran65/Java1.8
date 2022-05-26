package in.ashokit;

import java.util.Scanner;

public class HackerEarth {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		
		String[] strings = str.split("");
		
		
		int[] array = new int[strings.length];
		
		for(int i=0; i<array.length; i++) {
			array[i]=Integer.valueOf(strings[i]);
		}
		
		int n=2;
		if(n>str.length())
			n = n%str.length();
		String ss2 = str.substring(0,str.length()-n);
		String ss1 = str.substring(str.length()-n);
		
		System.out.println(ss1+ss2);
		
	}

}
