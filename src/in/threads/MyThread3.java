package in.threads;

import java.util.concurrent.Callable;

public class MyThread3 implements Callable<Integer>{
	
	private int n;
	
	public MyThread3(int n) {
		this.n = n;
	}

	@Override
	public Integer call() throws Exception {
		//factorial logic
		int res = n;
		if(n < 0) {
			throw new IllegalArgumentException("Numbers < 0 are not allowed");
		}
		for(int i = n-1; i>0; i--) {
			res = res * i;
		}
		
		return res;
	}


}
