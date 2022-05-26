package in.ashokit;

class Print extends Thread{
	
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

public class MultiThreadingEg2 {
	
	public static void main(String[] args) {
		
//		System.out.println(Thread.currentThread().getName());
		Print p1 = new Print();
		Print p2 = new Print();
		p1.start();
		p2.start();
	}
}
