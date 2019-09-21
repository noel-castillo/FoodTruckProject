package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckMenu extends FoodTruck {

//	F I E L D S

	private double averageRating;

	private double highestRating;

	private int menuChoice;

//	C O N S T R U C T O R S

	public FoodTruckMenu() {

	}

//	M E T H O D S

	public int displayMenu(Scanner keyboard) {
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Search all trucks with a desired minimum rating.");
		System.out.println("5. Search all trucks with a desired food type.");
		System.out.println("6. Quit the program.");
		int output = keyboard.nextInt();
		return output;
	}

	public void calculateAverageRating(FoodTruck[] foodTruck) {
		int counter = 0;
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			for (int c = 0; c < getFoodTruckNumber(); c++) {
				if (element != null) {
					averageRating += element.getRating();
					counter++;
				}
			}
		}
		averageRating /= counter;
		System.out.print("Average Rating: ");
		System.out.printf("%4.2f%n", averageRating);
	}

	public void calculateHighestRating(FoodTruck[] foodTruck) {
		String bestTruck = "";
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			for (int c = 0; c < getFoodTruckNumber(); c++) {
				if (element != null) {
					if (highestRating < element.getRating()) {
						highestRating = element.getRating();
						bestTruck = element.getName();
					}
				}
			}
		}
		System.out.println(bestTruck + " with a rating of " + highestRating);

	}

	public void searchMinimumRating(Scanner keyboard, FoodTruck[] foodTruck) {

		System.out.println("Enter minimum rating search: ");
		double minimumRating = keyboard.nextDouble();
		keyboard.nextLine();
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			if (element != null && element.getRating() >= minimumRating) {
				element.displayFoodTrucks();
			}
		}
	}

	public void searchFoodType(Scanner keyboard, FoodTruck[] foodTruck) {

		System.out.println("Enter food type search: ");
		keyboard.nextLine();
		String sFoodType = keyboard.nextLine();
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			if (element != null && sFoodType.equalsIgnoreCase(element.getFoodType())) {
				element.displayFoodTrucks();
			}
		}
	}

	public boolean displayMenuChoice(Scanner keyboard, FoodTruck[] foodTruck) {

		boolean proceed = true;
		while (proceed) {
			menuChoice = displayMenu(keyboard);
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
				searchMinimumRating(keyboard, foodTruck);
				break;
			case 5:
				searchFoodType(keyboard, foodTruck);
				break;
			case 6:
				proceed = false;
				break;
			default:
				System.out.println("Not an option.");
				break;
			}
		}
		return proceed;
	}

}
