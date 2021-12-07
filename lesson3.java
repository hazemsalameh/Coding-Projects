import java.util.Scanner;

public class lesson3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String,double, int, char, Boolean
		
		//ask for user name
		Scanner input= new Scanner (System.in);
		System.out.println("What is your name");
		String name=input.nextLine();
		System.out.println("Hello,"+ name);
		
		//ask user for user age 
		System.out.println("How old are you?");
		 String age=input.nextLine();
		System.out.println("address?");
		String address = input.nextLine();
		System.out.println("what's ur phone number?");
		String number = input.nextLine();
		
		//close scanner
		input.close();
		
		
			

	}

}
