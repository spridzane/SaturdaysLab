package lab.saturday;

/**
Calculates the area of a square given a side SaturdayLab1: Data types. Variables. Constants. Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java
 */
//declare a class called Square
public class Square {
	//declare main method to run our App
	public static void main(String[] args) {
		//declaare the variables to represent side of square
		int sideOfSquare;
		sideOfSquare = 7;
		int areaOfSquare;
		areaOfSquare = sideOfSquare * sideOfSquare;
		//areaOfSquare = Math.pow(sideOfSquare, 2); kāpināšana, jādeklarē kā double
		System.out.println("The area of the square is " + areaOfSquare);
	}
}