package in.threads;

public class MyThread2 extends Thread {
	
	public void run() {
		for(int i=10; i<20; i++) {
			System.out.println(i+">>"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
