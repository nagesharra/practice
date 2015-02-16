package com.test.patterns.creational.builder;

public class Coke extends ColdDrink {
	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return .99f;
	}
}
