package in.ashokit;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingEg {
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(20);
		ExecutorCompletionService<Object> pool = new ExecutorCompletionService<>(es);
		
		for(int i=0; i<=40; i++) {
			pool.submit(new Callable<Object>() {

							@Override
							public Object call() throws Exception {
								Thread.sleep(1000);
								System.out.println(Thread.currentThread().getName());
								return null;
							}
							
			 			}
					);
		}
	}

}
