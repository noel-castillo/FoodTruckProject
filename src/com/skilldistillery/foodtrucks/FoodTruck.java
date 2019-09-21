package com.skilldistillery.foodtrucks;

import java.util.Arrays;
import java.util.Scanner;

public class FoodTruck {

//	F I E L D S

	private String name;

	private String foodType;

	private double rating;

	public int foodTruckNumber = 0;

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
		System.out.println("Enter food truck data or quit if done entering data.");
		System.out.print("Food truck name:");
		String name = keyboard.next();
		System.out.print("Food type:");
		String foodType = keyboard.next();
		System.out.print("Food truck rating:");
		double rating = keyboard.nextDouble();
		FoodTruck nextFoodTruck = new FoodTruck(name, foodType, rating);
		return nextFoodTruck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void addFoodTruck(FoodTruck nextFoodTruck) {
		if(nextFoodTruck == null) {
			this.foodTruck[foodTruckNumber] = null;
		} else {
		this.foodTruck[foodTruckNumber] = nextFoodTruck;
		}
		foodTruckNumber++;
	}

	public FoodTruck[] getFoodTrucks() {
		FoodTruck[] foodTruckCopy = new FoodTruck[numberOfFoodTrucks];
		for (int c = 0; c < foodTruck.length; c++) {
			foodTruckCopy[c] = foodTruck[c];
		}
		return foodTruckCopy;
	}
	
	public void viewAllFoodTruck() {
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
		System.out.println("1. List all existing food trucks.");
		System.out.println("2. See the average rating of food trucks.");
		System.out.println("3. Display the highest-rated food truck.");
		System.out.println("4. Quit the program.");
		int output = keyboard.nextInt();
		return output;
	}
	
	
	
	@Override
	public String toString() {
		return "FoodTruck [foodTruck=" + Arrays.toString(foodTruck) + ", name=" + name + ", foodType=" + foodType
				+ ", rating=" + rating + ", foodTruckNumber=" + foodTruckNumber + "]";
	}

	public void displayMenuChoice(int menuChoice) {
		switch(menuChoice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		
		}
	}
}
