package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruck {
	
//	F I E L D S
	
	private FoodTruck[] foodTruck;
	
	private String name;
	
	private String foodType;
	
	private double rating;
	
	private int foodTruckNumber = 0;
	
	private int numberOfFoodTrucks = 5;
	
//	C O N S T R U C T O R S
	
	public FoodTruck(String name, String foodType, double rating) {
		
		foodTruck = new FoodTruck[numberOfFoodTrucks];
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
	
	public void addFoodTruck(FoodTruck nextFoodTruck) {
		this.foodTruck[foodTruckNumber] = nextFoodTruck;
		foodTruckNumber++;
	}
	
	public FoodTruck[] getFoodTrucks() {
		FoodTruck[] foodTruckCopy = new FoodTruck[numberOfFoodTrucks];
		for (int c = 0; c < foodTruck.length; c++) {
			foodTruckCopy[c] = foodTruck[c];
		}
		return foodTruckCopy;
	}

}
