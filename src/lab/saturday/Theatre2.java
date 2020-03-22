package lab.saturday;
/**
More Problems on Selection Statements
Problem 2:
The theatre has now decided to charge based both on the day of the week and on the age of the customer.
The new table of prices is outlined below:
Day:				    Age			    Price:
Monday - Thursday   Under 5/Over 65		Free
                       5 – 15			    €15
                       15 - 65			    €20
Friday - Sunday		Under 5/Over 65		€5
                       5 – 15			    €20
                       15 - 65			    €30
Use instantiable classes in your application. Save the instantiable class as Theatre2.java
Theatre2 -- the instantiable class, uses 2 nested if else selection statements to determine the cost of
a theatre ticket based on a given day and a customer's age
*/
public class Theatre2 {
	// declare instance variable to store the day
    private String day;
    // declare instance variable to store the price of a ticket based on the given day
    private int price;
    //declare instance variable to store the age of customer's age
    private int age;

    // Constructor - initialize the day with the empty string;
    public Theatre2(){
        day = "";
        price = 0;
        age = 0;
    }
    // declare a setter method for each of the instance variables that can be set/ assigned a value
    // setter method for the day instance variable
    public void setDay(String day1){
        day = day1;
    }
    //setter method for the age instance variable
    public void setAge(int age1){
        age = age1;
    }
    // the method which does the actual processing: based on a given day and customer's age determines the price of
    // the ticket
    // the program should work irrespective of the way the day is written
    public void calculatePrice(){
        day = day.toLowerCase();
        if((day.equals("monday") || day.equals("tuesday")) || day.equals("wednesday") || day.equals("thursday")) {
            if ((age < 5) || (age >= 65)){
                price = 0;
                System.out.println("Price of the ticket is €" + price);
            }
            if ((age >= 5) && (age < 15)){
                price = 15;
                System.out.println("Price of the ticket is €" + price);
            }
            if ((age >= 15) && (age < 65)){
                price = 20;
                System.out.println("Price of the ticket is €" + price);
            }

            } else if ((day.equals("friday") || day.equals("saturday") || day.equals("sunday"))) {
                if ((age < 5) || (age >= 65)) {
                    price = 5;
                    System.out.println("Price of the ticket is €" + price);
                }
                if ((age >= 5) && (age < 15)) {
                    price = 20;
                    System.out.println("Price of the ticket is €" + price);
                }
                if ((age >= 15) && (age < 65)) {
                    price = 30;
                    System.out.println("Price of the ticket is €" + price);
                } 
            } else {
            	System.out.println("Day is not valid!");
            }
 
    }
          
    public int getPrice() {
    	return price;
    }
}



