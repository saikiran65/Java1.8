package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Binaray {
	
	public static void main(String[] args) {
//		int[] b = binaray(0);
//		for(int p : b) {
//			System.out.print(p);
//		}
		
		long decimal = decimal(1111);
		System.out.println(decimal);
	}
	
	public static int[] binaray(int decimal){
		if(decimal==0) {
			int[] z = {0};
			return z;
		}
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(decimal !=0){
			list.add(decimal % 2);
			decimal = decimal / 2;
		}
	
		int[] output = new int[list.size()];
		int k = 0;
		for(int j=list.size()-1; j>=0; j--){ 
			output[k] = list.get(j);
			k++;
		}
		return output;
	}
	
	public static long decimal(long binary){
		long dec = 0;
		int p = 0;
		while( binary!=0) {
			int k = (int) binary%10;
			
			dec = (long) ((dec) + (Math.pow(2,p) * k));
			p++;
			
			binary = binary/10;
		}
	
		return dec;	
	
	}

}
