package com.test.patterns.creational.builder;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		return new Wrapper();
	}
}
