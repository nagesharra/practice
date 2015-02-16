package com.test.threads;

public class SimpleThread {
	
	public static void main(String[] args) {
		
		System.out.println("main start: this is:"+Thread.currentThread().getName());
		Thread t = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("inside thread");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("inside thread 2");
				
			}
		});
		
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end: this is:"+Thread.currentThread().getName());
	}

}
