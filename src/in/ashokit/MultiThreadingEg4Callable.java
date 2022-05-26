package in.ashokit;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class Intel implements Callable<Object>{
	
	public Object call() throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		}
		
		return "abc";
	}
}

public class MultiThreadingEg4Callable {
	
	public static void main(String[] args) {
		Intel intel = new Intel();
		FutureTask<Object> ft = new FutureTask<>(intel);
		Thread t = new Thread(ft);
		t.start();
		
		
		/*
		ExecutorService es = Executors.newFixedThreadPool(1);
		ExecutorCompletionService<Object> pool = new ExecutorCompletionService<>(es);
		
		pool.submit(new Callable<Object>(){
			
			public Object call() throws Exception{
				System.out.println("MT");
				return null;
			}
		});
		*/
	}

}
