package com.test.patterns.creational.factory;


public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		try {
			Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
			circle.draw();
			Shape triangle = shapeFactory.getShape(ShapeType.TRIANGLE);
			triangle.draw();
			Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
			rectangle.draw();
			Shape invalid = shapeFactory.getShape(ShapeType.POLYGONE);
			invalid.draw();
		}catch (UnsupportedShapeTypeException e) {
			e.printStackTrace();
		}
	}

}
