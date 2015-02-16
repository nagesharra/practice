package com.test.patterns.creational.builder;

public class ChickenBurger extends Burger {
	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 3.99f;
	}
}
