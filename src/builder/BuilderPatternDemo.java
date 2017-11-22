package builder;

import builder.extended.CarGame;
import builder.extended.DrawGame;

public class BuilderPatternDemo {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal().build();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal().build();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());

		Meal customMeal = mealBuilder
				.prepareNonVegMeal()
				.addItem(new ChickenBurger())
				.build();
		System.out.println("\n\nCustom Meal");
		customMeal.showItems();
		System.out.println("Total Cost: " + customMeal.getCost());

		Meal myMeal = new Meal();
		myMeal
			.addItem(new Coke())
			.addItem(new ChickenBurger())
			.addItem(new CarGame());
		System.out.println("\n\nMy Meal");
		myMeal.showItems();
		System.out.println("Total Cost: " + myMeal.getCost());

		Meal theBigOne = new Meal();
		theBigOne
			.addItem(new ChickenBurger(),4)
			.addItem(new Coke(), 2)
			.addItem(new DrawGame());
		System.out.println("\n\nThe Big One");
		theBigOne.showItems();
		System.out.println("Total Cost: " + theBigOne.getCost());
	}
}
