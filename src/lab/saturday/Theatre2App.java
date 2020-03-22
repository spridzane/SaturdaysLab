package lab.saturday;

import java.util.Scanner;

public class Theatre2App {
	public static void main(String args[]) {
	 // declare a variable to store the day entered by the user
    String d;
    int a;
    // declare a variable named t and create an object of type Theatre1If
    Theatre2 t = new Theatre2();
    // create an object of type Scanner to allow input from the keyboard
    Scanner input = new Scanner(System.in);
    // input
    // prompt the user to input a day
    System.out.println("Please enter the day: ");
    // reads a single word from the keyboard
	d = input.next();
    // use (i.e. by calling/invoking) the setter method setDay()
	t.setDay(d);
	System.out.println("Please enter your age: ");
    a = input.nextInt();
    // use (i.e. by calling/invoking) the setter method setDay()
    t.setAge(a);
 // to store in the instance variable named day of the object t the day provided by the user
    // processing: calculate the price of a ticket in the given day
    t.calculatePrice();
    // output
    // invoke/call the getter method getPrice() to retrieve the cost of the ticket
    t.getPrice();
    // it is not mandatory, but we can display a user friendly message in case that the day is not valid,
    // and therefore there is a negative value in the p variable
    // (recall that the calculatePrice() method of the Theatre1If class assigns/stores in the price instance
    // variable if the day is invalid)
	} 

}

