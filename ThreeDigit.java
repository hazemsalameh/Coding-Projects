import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your  full name:");
		String name = input.nextLine();
		System.out.println("Hello, "+ name+ " . Please enter your first Three Digit Number:");
		String strNumber = input.nextLine();
		double number = Double.parseDouble(strNumber); //$266
		
		System.out.println("Please enter your first Three Digit Number:");
		strNumber= input.nextLine();
		double print = Double.parseDouble(strNumber); //513
		System.out.print("------------------------------------------------");
		number = number*+Double.parseDouble(strNumber); //266*513
		print = print +Double.parseDouble(strNumber); //266+513
		
		System.out.println("Hi Zaineh Salameh, here is your information:");
		System.out.println("The product of your numbers is:"+number);
		System.out.println("The sum of your number is:"+print);
		
//		number = number +Double.parseDouble(strNumber); //266*513
//		digit = digit  +Double.parseDouble(digit); //266+513
//		
//		System.out.println("Hi Zaineh Salameh,here is your information:");
//		System.out.println("The product of your numbers is:"+number);
//		System.out.println("The sum of your numbers is" +digit);
		 
	}

}
