package in.ashokit;

class Zebra extends Thread{
	
	int num;
	
	@Override
	public void run() {
		synchronized(this) {
				try {
					Thread.sleep(1000);
					if(num%2==0) {
						System.out.println(num+" : even");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				finally {
					this.notify();
				}
		}	
	}
}

class Yak extends Thread{

	int count=0;
	@Override
	public void run() {
		
		synchronized (this) {
			for(int i=1; i<=10; i++) {
				count +=100;
			}
			this.notify();
		}
	}
	
}

public class ThreadControl {
	
	public static void main(String[] args) throws InterruptedException {
		
		Zebra z = new Zebra();
		Yak y = new Yak();
		
		y.start();
		
		synchronized (y) {
			y.wait();
			System.out.println(y.count);
		}
		
	}

}
