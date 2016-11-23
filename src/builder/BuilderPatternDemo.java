package builder;

import builder.extended.CarGame;
import builder.extended.DrawGame;

public class BuilderPatternDemo {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());

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
