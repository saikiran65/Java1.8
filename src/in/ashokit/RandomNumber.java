package in.ashokit;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		int min = 1; 
		int max = 100;
		
//		for(int i=0; i<10; i++) {
//			System.out.println((int) (Math.random()*(max-min)+1));
//		}
		
		Random random = new Random();
		System.out.println(random.nextInt((max-min)+1)+min);
		
		System.out.println(ThreadLocalRandom.current().nextInt(1,100+1));
	}

}
