package conditional;
import java.util.Scanner;
public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number = Integer.parseInt(input.nextLine());
		
		
		
			
		for ( int i = 1; i <= number; i++) {
			System.out.println("Hello" + i);
			
		}

	}

}
