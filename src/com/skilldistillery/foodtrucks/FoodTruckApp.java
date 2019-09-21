package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		FoodTruck app = new FoodTruck();
		boolean proceed = false;

		do {
			FoodTruck nextFoodTruck = app.getFoodTruckInfo(keyboard);
			proceed = app.addFoodTruck(nextFoodTruck);
		} while (!proceed);

		do {
			int menuChoice = app.displayMenu(keyboard);
			proceed = app.displayMenuChoice(menuChoice);
		} while (proceed);

		System.out.println("Goodbye.");

		keyboard.close();
	}

}
