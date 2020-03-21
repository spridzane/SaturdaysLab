package lab.saturday;

import java.util.Scanner;

public class ChangeCal {

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
		change = change % 50;
		
		pay20 = change / 20;
		System.out.println(pay20 + " twenty euro note(s)");
		change = change % 20;
		
		pay10 = change / 10;
		System.out.println(pay10 + " ten euro note(s)");
		change = change % 10;
		
		pay5 = change / 5;
		System.out.println(pay5 + " five euro note(s)");
		change = change % 5;
		
		pay2 = change / 2;
		System.out.println(pay2 + " two euro coin(s)");
		change = change % 2;
		
		pay1 = change / 1;
		System.out.println(pay1 + " one euro coin(s)");
		
		}
}
