package com.test.patterns.creational.factory;

public enum ShapeType {
	CIRCLE(101),
	RECTANGLE(102),
	TRIANGLE(103),
	POLYGONE(104);
	
	private final int type;
	
	ShapeType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
}
