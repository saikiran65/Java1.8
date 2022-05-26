package in.threads;

public class MyThread1 implements Runnable {
	
	
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i+">>"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
