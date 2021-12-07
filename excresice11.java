package conditional;

import java.util.Scanner;

public class excresice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//add scanner
		Scanner input = new Scanner(System.in);
		
		//make variables
		int a, b, c = 0;
		double negEquation, posEquation, negEquation1, posEquation1, equation2  = 0;
		
		//ask user for values
		System.out.println("Enter value for a: ");
		String strA = input.nextLine();
		a = Integer.parseInt(strA);
		System.out.println("Enter value for b: ");
		String strB = input.nextLine();
		b = Integer.parseInt(strB);
		System.out.println("Enter value for c: ");
		String strC = input.nextLine();
		c = Integer.parseInt(strC);
		
		//calculate the roots using the quadratic equation
		equation2 = Math.sqrt((Math.pow(b, 2)-(4*a*c)));
		
		//when adding negative square root
		negEquation1 = -b - equation2;
		negEquation = negEquation1/(2*a);
		
		//when adding positive square root
		posEquation1 = -b + equation2;
		posEquation = posEquation1/(2*a);
		
		//displaying square roots
		if (posEquation>-999) {
			System.out.println("The roots are " + posEquation + " and " + negEquation);
		} else {
			System.out.println("Roots aren't available for values entered");
		}
		
		//closing scanner
		input.close();
	}



	product = dicenum1*dicenum2* dicenum3;
	dicenum1 = (int)(Math.random()*(6-1+1)) + 1;
	dicenum2 = (int)(Math.random()*(6-1+1)) + 1;
	dicenum3 = (int)(Math.random()*(6-1+1)) + 1;
	System.out.println(dicenum1 + "\t" + dicenum2 + dicenum3 +"\t" + "*");
}



	}


