package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		FoodTruckMenu app = new FoodTruckMenu();
		System.out.println("How many food trucks will you enter?");
		app.numberOfFoodTrucks = (keyboard.nextInt());
		keyboard.nextLine();
		FoodTruck[] foodTruck = new FoodTruck[app.numberOfFoodTrucks];

		while (app.getFoodTruckNumber() < app.getNumberOfFoodTrucks()) {
			foodTruck[app.getFoodTruckNumber()] = app.getFoodTruckInfo(keyboard);
			if (foodTruck[app.getFoodTruckNumber() - 1] == null) {
				break;
			}
		}

		app.displayMenuChoice(keyboard, foodTruck);

		System.out.println("Goodbye.");

		keyboard.close();
	}

}
