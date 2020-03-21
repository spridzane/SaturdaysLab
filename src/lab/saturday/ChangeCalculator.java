package lab.saturday;

import java.util.*;
/**
Calculates the change owned to a customer.
SaturdayLab1: Data types. Variables. Constants.
Problem 7 ChangeCalculator is an application that helps a seller to give the right
change to a customer. The application prompts the user to enter the total
price of the items bought and the received received from the customer. The
application calculates and displays the change the customer is owed. In
addition, the application calculates and displays the maximum number of
how many EUR 50, EUR 20, EUR 10 and EUR 5 notes, and how many
EUR 2 and EUR 1 coins the seller has to give to the customer as change.
For simplicity, let's consider that the seller does not want to deal with small
coins (i.e. 50c, 20c, etc.), therefore although the total price of the items
bought may be a decimal number the seller will enter the price rounded
down to the nearest euro (e.g. 24.7 will be rounded down to 24). 
Write, compile and test whether the application provides the right change.
Save the class as ChangeCalculator.java
*/
public class ChangeCalculator {
	public static void main(String[] args) {
		
	int price, recieved, change;
	int pay50, pay20, pay10, pay5, pay2, pay1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter price of the items bought");
	price = sc.nextInt();
	System.out.println("Received from customer");
	recieved = sc.nextInt();
	
	change = recieved - price;
	System.out.println("Change is: " + change);
	
	System.out.println("The customer should be given: ");
	
	pay50 = change / 50;
	System.out.println(pay50 + " fifty euro note(s)");
	
	change = change - 50 * pay50;
	System.out.println(change);
	
	pay20 = change / 20;
	System.out.println(pay20 + " twenty euro note(s)");
	change = change - 20 * pay20;
	
	pay10 = change / 10;
	System.out.println(pay10 + " ten euro note(s)");
	change = change - 10 * pay10;
	
	pay5 = change / 5;
	System.out.println(pay5 + " five euro note(s)");
	change = change - pay5 * 5;
	
	pay2 = change / 2;
	System.out.println(pay2 + " two euro coin(s)");
	change = change - pay2 * 2;
	
	pay1 = change / 1;
	System.out.println(pay1 + " one euro coin(s)");
	
	}
	
}
