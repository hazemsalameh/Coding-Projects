package conditional;
import java.util.Scanner;
public class excercise17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//setting password
		String password = "zainah1602";
		
		//getting user's password
		System.out.println("Please enter your password to login");
		String userPassword=input.nextLine();
		
		//correct password
		if(userPassword.equals(password)) {
			System.out.println("Welcome");
		}
		
		//incorrect password
		else { 
			for ( int i=0; i<=2; i++) {
				if ( i==2) {
					System.out.println("Entry denied.");
					System.exit(0);
				}
				System.out.println("The password you typed is incorrect, try again");
				System.out.println("Enter the password");
				userPassword = input.nextLine();
				if (userPassword.equals(password)) {
					System.out.println("Welcome!");
					System.exit(0);
				}
			}
		}

	}

}
