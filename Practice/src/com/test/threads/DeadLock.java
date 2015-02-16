package com.test.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeadLock {
	Object A = new Object();
	Object B = new Object();

	public static void main(String[] args) {
		new DeadLock();
	}
	
	public DeadLock() {
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println(name+ " trying a lock on A");
				synchronized (A) {
					System.out.println(name+ " obtained lock on A");
					System.out.println(name+ " sleeping for 3 seconds ");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(name+ " trying a lock on B");
					synchronized (B) {
						System.out.println(name+ " obtained lock on B");
					}				
				}
			}
		});
		
		service.execute(new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				
				System.out.println(name+ " trying a lock on B");
				synchronized (B) {
					System.out.println(name+ " obtained lock on B");
					System.out.println(name+ " sleeping for 3 seconds ");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(name+ " trying a lock on A");
					synchronized (A) {
						System.out.println(name+ " obtained lock on A");
					}				
				}
			}
		});
		
		service.shutdown();
		
	}
	
}
