package com.test.patterns.creational.builder;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("Veg Meal:");
		vegMeal.showItems();
		
		Meal nonVegMeal = builder.prepareNonVegMeal();
		System.out.println("Checken Meal:");
		nonVegMeal.showItems();
	}
}
