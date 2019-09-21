package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruck {

//	F I E L D S

	private String name;

	private String foodType;

	private double rating;

	private int foodTruckNumber = 0;

	public int numberOfFoodTrucks;

//	C O N S T R U C T O R S

	public FoodTruck() {
	}

	public FoodTruck(String name, String foodType, double rating, int foodTruckNumber) {

		setName(name);
		setFoodType(foodType);
		setRating(rating);
		setFoodTruckNumber(foodTruckNumber);
	}

//	M E T H O D S

	public int getFoodTruckNumber() {
		return foodTruckNumber;
	}

	public void setFoodTruckNumber(int foodTruckNumber) {
		this.foodTruckNumber = foodTruckNumber;
	}

	public int getNumberOfFoodTrucks() {
		return numberOfFoodTrucks;
	}

	public void setNumberOfFoodTrucks(int numberOfFoodTrucks) {
		this.numberOfFoodTrucks = numberOfFoodTrucks;
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

	public FoodTruck getFoodTruckInfo(Scanner keyboard) {
		System.out.println("Enter food truck data or enter quit to proceed:");
		System.out.print("Food truck name:");
		String name = keyboard.nextLine();
		if (name.equals("quit")) {
			foodTruckNumber++;
			return null;
		} else {
			System.out.print("Food type:");
			String foodType = keyboard.nextLine();
			System.out.print("Food truck rating:");
			double rating = keyboard.nextDouble();
			keyboard.nextLine();
			FoodTruck nextFoodTruck = new FoodTruck(name, foodType, rating, getFoodTruckNumber());
			foodTruckNumber++;
			return nextFoodTruck;
		}
	}

	public FoodTruck[] getFoodTrucks(FoodTruck[] foodTruck) {
		FoodTruck[] foodTruckCopy = new FoodTruck[numberOfFoodTrucks];
		for (int c = 0; c < foodTruck.length; c++) {
			foodTruckCopy[c] = foodTruck[c];
		}
		return foodTruckCopy;
	}

	public void viewAllFoodTrucks(FoodTruck[] foodTruck) {
		for (FoodTruck element : getFoodTrucks(foodTruck)) {
			if (element != null) {
				element.displayFoodTrucks();
			}
		}
	}

	public String getFoodTruckData() {
		String output = "Food Truck Number " + foodTruckNumber + " --- Name: " + name + ", Food Type: " + foodType
				+ ", Rating: " + rating;
		return output;
	}

	public void displayFoodTrucks() {
		String foodTruckData = getFoodTruckData();
		System.out.println(foodTruckData);
	}

}
