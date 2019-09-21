package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckMenu extends FoodTruck {
	public int displayMenu(Scanner keyboard) {
		System.out.println("1. List all existing food trucks or press enter to quit.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
		int output = keyboard.nextInt();
		return output;
	}

	public void calculateAverageRating(FoodTruck[] foodTruck) {
		double average = 0.0;
		int counter = 0;
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			for (int c = 0; c < getFoodTruckNumber(); c++) {
				if (element != null) {
					average += element.getRating();
					counter++;
				}
			}
		}
		average /= counter;
		System.out.print("Average Rating: ");
		System.out.printf("%4.2f%n", average);
	}

	public void calculateHighestRating(FoodTruck[] foodTruck) {
		double highest = 0.0;
		String bestTruck = "";
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			for (int c = 0; c < getFoodTruckNumber(); c++) {
				if (element != null) {
					if (highest < element.getRating()) {
						highest = element.getRating();
						bestTruck = element.getName();
					}
				}
			}
		}
		System.out.println(bestTruck + " with a rating of " + highest);

	}

	public boolean displayMenuChoice(int menuChoice, FoodTruck[] foodTruck) {
		boolean proceed = true;
		switch (menuChoice) {
		case 1:
			viewAllFoodTrucks(foodTruck);
			break;
		case 2:
			calculateAverageRating(foodTruck);
			break;
		case 3:
			calculateHighestRating(foodTruck);
			break;
		case 4:
			proceed = false;
			break;
		default:
			System.out.println("Not an option.");
			break;

		}

		return proceed;
	}

}
