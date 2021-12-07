import java.util.Scanner;

public class assignmet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hey can I get your name please?");
		String name = input.nextLine();
		System.out.println(" what's the price of a single bitcoin unit?? ");
		String bitcoin = input.nextLine();
		double money= Double.parseDouble(bitcoin);
		System.out.println("how many bitcoins do you plan on buying?");
		String buy = input.nextLine();
		double candy = Double.parseDouble(buy);
		System.out.println(buy); 
	    String cent = bitcoin+buy;
		System.out.println ("your total cost is:" ) money * cent);
		System.out.println("Thank you for using Zainah Bitcoin:" +cent);
		
	}

}
