package com.test.patterns.creational.builder;

public class Pepsi extends ColdDrink {
	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return .97f;
	}
}
