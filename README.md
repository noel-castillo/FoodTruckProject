## Food Truck Rating Project

### Week 2 Homework Project for Skill Distillery

### Overview

User will be prompted regarding how many food trucks they wish to enter.

User will be able to input data for a food truck and the program will continue to the next phase once they have inputted an amount according to the number of food trucks specified.

User can enter quit for the food truck name if there is no more food trucks to input even if they haven't inputted an amount equal to their initial prompt.

Program will display a menu with options from which the user can select from.

Option 1 will list the data for all of the food trucks entered.

Option 2 will list the average rating of all food truck ratings data entered.

Option 3 will display the food truck name and rating for the food truck with the highest rating.

Option 4 will quit the menu selection and proceed to the end of the program with a "Goodbye" message.

Any other value will display an error message and loop back to the menu options.

### Technologies/Topics Applied

Constructors to be used in loops to allow for the creation of multiple class objects in a feasible manner.

Instantiate an object in order to run methods of a class.

getters and setters to use private field variables.

Creating a copy of private field data as a layer of protection.

System.out.printf used in order to properly display double values at the proper
decimal length.

switch statement used to properly launch methods according to user input.

null exceptions included in methods in order to avoid errors when trying to do
something with a null value.

### Lessons Learned

Separation of methods to respective classes. FoodTruck class has methods related only to Food Trucks. FoodTruckMenu class has methods related only to menu options for Food Trucks. This makes it easier to comprehend and read the program as a whole.

Methods need to appropriately handle null inputs. The array used in this
program can potentially have many null values.
