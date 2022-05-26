package in.ashokit;

import java.util.Random;

public class RandomNumberGenerator {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i=1; i<=20; i++) {
			System.out.println(r.nextInt(100));
		}
	}

}
