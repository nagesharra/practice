package com.test.threads;

public class SimpleThreadWait {
	
	public static void main(String[] args) {
		final Object obj1 = new Object();
		
		System.out.println("main start: this is:"+Thread.currentThread().getName());
		final Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				for (int i=0; i<10; ++i) {
					System.out.print("A:"+i);
					if(i==5){
						synchronized(obj1){
							try {
								obj1.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}				
				}
				
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				for (int i=0; i<10; ++i) {
					System.out.print("B:"+i);
					if(i==5){
						synchronized(obj1){
							obj1.notify();
						}
					}
				}
			}
		});
		
		
		t1.start();
		t2.start();
		
//		try {
//			synchronized(obj1){
//				obj1.wait();
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		try {
			t1.join();
			//t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main end: this is:"+Thread.currentThread().getName());
	}

}

abstract interface A {
	
}
