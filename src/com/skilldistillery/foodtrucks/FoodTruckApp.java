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

		boolean proceed = false;

		while (app.getFoodTruckNumber() < app.getNumberOfFoodTrucks()) {
			foodTruck[app.getFoodTruckNumber()] = app.getFoodTruckInfo(keyboard);
			if (foodTruck[app.getFoodTruckNumber() - 1] == null) {
				break;
			}
		}

		do {
			int menuChoice = app.displayMenu(keyboard);
			proceed = app.displayMenuChoice(menuChoice, foodTruck);
		} while (proceed);

		System.out.println("Goodbye.");

		keyboard.close();
	}

}
