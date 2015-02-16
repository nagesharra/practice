package com.test.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsTest {
	public static void main(String[] args) {
		new ExecutorsTest();
	}
	
	public ExecutorsTest() {
		//simpleTest();
		//complexTest();
		complexTest3();
	}
	
	private void simpleTest() {
		ExecutorService service = Executors.newFixedThreadPool(10);
		service.execute(new Runnable() {
			
			public void run() {
				System.out.println("this is a thread: "+Thread.currentThread().getName());
			}
		});
	}
	
	private void complexTest() {
		ExecutorService service = Executors.newFixedThreadPool(10);

		for(int i=0; i<100; ++i) {
			service.execute(new Runnable() {
				
				public void run() {
					System.out.println("HELLO thread: "+Thread.currentThread().getName());
					System.out.println("ABCD is a thread: "+Thread.currentThread().getName());
				}
			});
		}
		
	}

	private void complexTest2() {
		ExecutorService service = Executors.newFixedThreadPool(10);

		for(int i=0; i<100; ++i) {
			service.execute(new Runnable() {
				
				public void run() {
					System.out.println("HELLO thread: "+Thread.currentThread().getName());
					System.out.println("ABCD is a thread: "+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		int totalWait = 0;
		while(!service.isShutdown()) {
			
			System.out.println("isShutdown: "+service.isShutdown());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			totalWait = totalWait+3;
			if(totalWait>20) {
				service.shutdown();
			}
		}
		
		try {
			service.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}


	//static int count = 0;
	volatile int count = 0;
//	Object lock = new Object();
	private void complexTest3() {
		ExecutorService service = Executors.newFixedThreadPool(10);

		for(int i=0; i<100000; ++i) {
			service.execute(new Runnable() {
				
				public void run() {
	//				synchronized (lock) {
						//count = count+1;
					++count;
		//			}
//					if(count==5) {
//						count=7;
//					}
//					System.out.println("HELLO thread: "+Thread.currentThread().getName());
//					System.out.println("ABCD is a thread: "+Thread.currentThread().getName());
//					System.out.println("Count: "+count+" "+Thread.currentThread().getName());

				}
			});
		}
		
//		int totalWait = 0;
//		while(!service.isTerminated()) {
//			
//			System.out.println("isShutdown: "+service.isShutdown());
//			System.out.println("isTerminated: "+service.isTerminated());
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			totalWait = totalWait+3;
//			if(totalWait>20) {
//				service.shutdown();
//			}
//		}
		service.shutdown();
		
		try {
			service.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Count: "+count+" "+Thread.currentThread().getName());
		
		System.out.println("the end");
		
	}
}
