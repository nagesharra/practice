package com.test.threads;

public class ThreadTest {
	public static void main(String[] args) {

		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, "hello");
		System.out.format("%s: %s%n", threadName, "hello");
	}
}
