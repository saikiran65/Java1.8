package in.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestThread {
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
//		*********runnable***********
		/* 
		MyThread1 t1 = new MyThread1();
//		t1.run(); // main thread will call run() method
		
		Thread t = new Thread(t1);
		t.start();
		System.out.println(Thread.currentThread().getName());
		*/
		
//		********** Thread class *************
		/* 
		MyThread2 t2 = new MyThread2();
		t2.start();
		
		t.start();
		*/
		
		
//		Callable Interface ****************** we get return type from using callable interface
		
		MyThread3 t3 = new MyThread3(-9);
		
		/*
		FutureTask<Integer> task = new FutureTask<>(t3);
		
		Thread t = new Thread(task);
		
		t.start();
		*/
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		Future<Integer> future = service.submit(t3);
		
		System.out.println(future.get().intValue());
		
	}

}
