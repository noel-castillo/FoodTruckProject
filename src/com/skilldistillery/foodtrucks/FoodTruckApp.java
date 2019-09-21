package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		String repeat = "";
		FoodTruck app = new FoodTruck();
		boolean proceed = true;
		
		do {
			FoodTruck nextFoodTruck = app.getFoodTruckInfo(keyboard);
			app.addFoodTruck(nextFoodTruck);
			System.out.println("Enter \"R\" to enter another food truck." + "\nOtherwise press any key to continue");
			repeat = keyboard.next().toLowerCase();
		} while(repeat.equals("r"));
		
		do {
		int menuChoice = app.displayMenu(keyboard);
		proceed = app.displayMenuChoice(menuChoice);
		} while (proceed);
		
		keyboard.close();
	}

}
