package in.ashokit;

class Apple implements Runnable {
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadinEg3 {
	
	public static void main(String[] args) {
		
		Apple a = new Apple();
		Thread t = new Thread(a);
		
		Apple b = new Apple();
		Thread t2 = new Thread(b);
		t.start();
		t2.start();
	}
}
