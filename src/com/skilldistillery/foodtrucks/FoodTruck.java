package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruck {

//	F I E L D S

	private String name;

	private String foodType;

	private double rating;

	private int foodTruckNumber = 0;

	private int numberOfFoodTrucks = 5;

	private FoodTruck[] foodTruck = new FoodTruck[numberOfFoodTrucks];

//	C O N S T R U C T O R S

	public FoodTruck() {
	}

	public FoodTruck(String name, String foodType, double rating) {

		setName(name);
		setFoodType(foodType);
		setRating(rating);
	}

//	M E T H O D S

	public FoodTruck getFoodTruckInfo(Scanner keyboard) {
		System.out.println("Enter food truck data or enter quit to proceed:");
		System.out.print("Food truck name:");
		String name = keyboard.nextLine();
		if (name.equals("quit")) {
			return null;
		} else {
			System.out.print("Food type:");
			String foodType = keyboard.nextLine();
			System.out.print("Food truck rating:");
			double rating = keyboard.nextDouble();
			keyboard.nextLine();
			FoodTruck nextFoodTruck = new FoodTruck(name, foodType, rating);
			return nextFoodTruck;
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return this.foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return this.rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean addFoodTruck(FoodTruck nextFoodTruck) {
		boolean output = false;
		if (nextFoodTruck != null) {
			this.foodTruck[foodTruckNumber] = nextFoodTruck;
			foodTruckNumber++;
		} else {
			output = true;
		}
		return output;
	}

	public FoodTruck[] getFoodTrucks() {
		FoodTruck[] foodTruckCopy = new FoodTruck[numberOfFoodTrucks];
		for (int c = 0; c < foodTruck.length; c++) {
			foodTruckCopy[c] = foodTruck[c];
		}
		return foodTruckCopy;
	}

	public void viewAllFoodTrucks() {
		for (FoodTruck element : getFoodTrucks()) {
			if (element != null) {
				element.displayFoodTrucks();
			}
		}
	}

	public String getFoodTruckData() {
		String output = "Food Truck Name: " + name + ", Food Type: " + foodType + ", Rating: " + rating;
		return output;
	}

	public void displayFoodTrucks() {
		String foodTruckData = getFoodTruckData();
		System.out.println(foodTruckData);
	}

	public int displayMenu(Scanner keyboard) {
		System.out.println("1. List all existing food trucks or press enter to quit.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
		int output = keyboard.nextInt();
		return output;
	}

	public void calculateAverageRating() {
		double average = 0.0;
		int counter = 0;
		for (FoodTruck element : getFoodTrucks()) {
			for (int c = 0; c < foodTruckNumber; c++) {
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

	public void calculateHighestRating() {
		double highest = 0.0;
		String bestTruck = "";
		for (FoodTruck element : getFoodTrucks()) {
			for (int c = 0; c < foodTruckNumber; c++) {
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

	public boolean displayMenuChoice(int menuChoice) {
		boolean proceed = true;
		switch (menuChoice) {
		case 1:
			viewAllFoodTrucks();
			break;
		case 2:
			calculateAverageRating();
			break;
		case 3:
			calculateHighestRating();
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
