package com.test.patterns.creational.singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		//SingleObject so = new SingleObject();
		//above leads to a compile time error as the constructor is not visible
		
		SingleObject instance = SingleObject.getInstance();
		instance.showMessage();
		System.out.println("to string: "+instance);
		SingleObject instance2 = SingleObject.getInstance();
		instance2.showMessage();
		System.out.println("to string: "+instance2);
		
		System.out.println("is it really single object: "+ (instance == instance2));
	}
}
