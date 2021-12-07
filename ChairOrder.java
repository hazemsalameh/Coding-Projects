package conditional;

import java.util.Scanner;

public class ChairOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		//name
		System.out.println("What is your name?");
		String strName = input.nextLine();
		
		System.out.println("How many chairs would you like to purchase?");
		String strChair = input.nextLine();
		double chair = Double.parseDouble(strChair);
				
		System.out.println("Are these covered chairs?- please enter true or false?");
		String strCover = input.nextLine();
		
		System.out.println("Do you live in Newfoundland or Quebec, - please enter 1 for Newfoundland and 2 for Quebec. ");
		String strLive = input.nextLine();
		double live = Double.parseDouble(strLive);
				
		System.out.println("Which coupon do you have ABC or D?");
		String coupon = input.nextLine();
		
		Object taxCost;
				int totalCost = 0;
				//add tax to cost
				if (live == 1) {
					taxCost = (15*totalCost)/100; 
				} else if (live == 2) {
					taxCost = (5*totalCost)/100;
				}
				
				int couponCost;
				//add coupon to cost
				switch (coupon) {
			 
					couponCost = (2*totalCost)/100;
					break;
				}



		
		
		
		System.out.println("------------------------------------");
		
		System.out.println("Sales Order:");
		System.out.println("Customer: Zainah Salameh");
		System.out.println("21 covered Chairs");
		System.out.println("total cost: $3885");
		System.out.println("Sale taxes for Quebec: $3890");
		System.out.println("Discount for coupon D - $3306, 583.5 cashback!!");
		System.out.println("                                     ");
		System.out.println("Bill of sales:                    $3885.");
		System.out.println("                                  $3890.");
		System.out.println("                                  $583.5 discount");
		System.out.println("                     ----------------------------------");
		System.out.println("                                  $3306");
		System.out.println( );
		System.out.println("Thank you for your order!!");
		
		
		
		
			
		}
		
		
		
		
		
		

	}


