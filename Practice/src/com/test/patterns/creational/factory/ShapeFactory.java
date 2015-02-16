package com.test.patterns.creational.factory;

public class ShapeFactory {
	
	/**
	 * Return shape objects based on shape type passed.
	 * @param shapeType
	 * @return
	 * @throws InvalidShapeTypeException
	 */
	public Shape getShape(ShapeType shapeType) throws UnsupportedShapeTypeException {
		switch (shapeType) {
			case CIRCLE: return new Circle();
			case TRIANGLE: return new Triangle();
			case RECTANGLE: return new Rectangle();
			default: 
				System.out.println("Unsupported shape type");
				throw new UnsupportedShapeTypeException("unsupported shapeType passed");
		}
	}
}
