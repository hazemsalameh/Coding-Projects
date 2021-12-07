package array;
import java.util.Scanner;
public class countSonsanants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating scanner
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your text");
		String usertext = input.nextLine();
		
		//creating char array
		char [] letter = usertext.toCharArray();
		
		int counter =0;
		for (int i=0; i < usertext.length(); i++) {
			if (letter[i]== 'a'|| letter [i]== 'e' || letter [i]== 'i'|| letter [i]== 'o'|| letter[i]== 'u') {
		}
			//consanant counter
			else {
				counter ++;
			}

	}
		System.out.println("The number of consonanats is:" + counter);
	}
}
